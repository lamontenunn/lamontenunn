package Ex_17_20;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class AddressWriter {
    private final String filename;

    public AddressWriter(String filename) {
        this.filename = filename;
    }

    public void write(List<Addresses> Addresses) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            out.writeInt(Addresses.size());

            // Write each Addresses to the file
            for (Addresses i : Addresses) {
                out.writeInt(Addresses.getId());
                out.writeUTF(Addresses.getName());
                out.writeUTF(Addresses.getStreet());
                out.writeUTF(Addresses.getCity());
                out.writeUTF(Addresses.getState());
                out.writeUTF(Addresses.getZip());
            }
        }
    }
}