// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rla implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sla b;
    public final /* synthetic */ int c;

    public /* synthetic */ rla(sla slaVar, int i, byte b) {
        this.a = b;
        this.b = slaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        sla slaVar = this.b;
        switch (b) {
            case 0:
                int i2 = slaVar.k;
                sk4[] sk4VarArr = slaVar.c;
                if (sk4VarArr[i] == null) {
                    sk4VarArr[i] = new sk4(i2);
                }
                Bitmap bitmap = slaVar.e;
                if (bitmap == null) {
                    slaVar.e = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    slaVar.f = new Canvas(slaVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                slaVar.a(slaVar.f, slaVar.o);
                Utilities.copyBitmaps(slaVar.e, (Bitmap) sk4VarArr[i].b);
                gl.c3(new rla(slaVar, i, b2));
                break;
            default:
                slaVar.d = i;
                slaVar.g.setShader((BitmapShader) slaVar.c[i].c);
                slaVar.j = false;
                slaVar.p = true;
                break;
        }
    }
}
