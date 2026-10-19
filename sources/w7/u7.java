package w7;

import java.io.DataInputStream;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class u7 {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            fArr[i10] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
