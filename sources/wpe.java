// default package

import java.io.DataInputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class wpe {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
