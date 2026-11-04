package x7;

import java.io.DataInputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t5 {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            fArr[i3] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
