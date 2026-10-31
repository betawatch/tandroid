package w7;

import java.io.DataInputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class p {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            fArr[i10] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
