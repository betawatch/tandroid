// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class we2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ we2(long j, Bitmap bitmap, byte b) {
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
                v2f.d(v2f.c(j), bitmap);
                break;
            default:
                v2f.d("thumb_" + j, bitmap);
                break;
        }
    }
}
