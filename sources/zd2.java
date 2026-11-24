// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ zd2(long j, Bitmap bitmap, byte b) {
        this.a = b;
        this.b = j;
        this.c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Bitmap bitmap = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                dye.d(dye.c(j), bitmap);
                break;
            default:
                dye.d("thumb_" + j, bitmap);
                break;
        }
    }
}
