package Ex_17_20;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class AddressReader {
    private final String filename;

    public AddressReader(String filename) {
        this.filename = filename;
    }

    public List<Addresses> read() throws IOException {
        Path path = Paths.get(filename);
        byte[] data = Files.readAllBytes(path);
        List<Addresses> addresses = new ArrayList<>();

        try (DataInputStream in = new DataInputStream(new ByteArrayInputStream(data))) {
            // Read the number of addresses from the beginning of the file
            int numAddresses = in.readInt();

            // Read each address from the file
            for (int i = 0; i < numAddresses; i++) {
                String name = in.readUTF();
                String street = in.readUTF();
                String city = in.readUTF();
                String state = in.readUTF();
                String zip = in.readUTF();

                addresses.add(new Addresses(name, street, city, state, zip));
            }
        }

        return addresses;
    }
}
