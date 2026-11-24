// default package

import java.io.DataInputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class zre {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
