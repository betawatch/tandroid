// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vs8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ws8 b;

    public /* synthetic */ vs8(ws8 ws8Var, byte b) {
        this.a = b;
        this.b = ws8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r2.getHeight() == r4.b.getHeight()) goto L41;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        ru8[] ru8VarArr;
        byte b2 = this.a;
        ws8 ws8Var = this.b;
        switch (b2) {
            case 0:
                synchronized (ws8Var.b) {
                    ru8[] ru8VarArr2 = ws8Var.c;
                    ru8 ru8Var = ru8VarArr2[0];
                    ru8[] ru8VarArr3 = ws8Var.d;
                    b = 2;
                    ru8VarArr = new ru8[]{ru8Var, ru8VarArr3[0], ru8VarArr2[1], ru8VarArr3[1], ru8VarArr2[2], ru8VarArr3[2]};
                }
                boolean z = false;
                for (int i = 0; i < 6; i += 2) {
                    ru8 ru8Var2 = ru8VarArr[i];
                    ru8 ru8Var3 = ru8VarArr[i + 1];
                    if (ru8Var2 != null && !ru8Var2.c && ru8Var2.f) {
                        ru8Var2.e = true;
                        if (ru8Var3 != null) {
                            Bitmap bitmap = ru8Var3.b;
                            if (!ru8Var3.d) {
                                if (bitmap.getWidth() == ru8Var2.b.getWidth()) {
                                    break;
                                }
                            }
                        }
                        if (ru8Var3 != null) {
                            ru8Var3.a();
                        }
                        ru8Var3 = new ru8();
                        Bitmap createBitmap = Bitmap.createBitmap(ru8Var2.b.getWidth(), ru8Var2.b.getHeight(), Bitmap.Config.ARGB_8888);
                        ru8Var3.b = createBitmap;
                        ru8Var3.a = new Canvas(createBitmap);
                        synchronized (ws8Var.b) {
                            ru8[] ru8VarArr4 = ws8Var.d;
                            int i2 = 0;
                            while (true) {
                                ru8[] ru8VarArr5 = ws8Var.c;
                                if (i2 >= ru8VarArr5.length) {
                                    i2 = 0;
                                } else if (ru8VarArr5[i2] != ru8Var2) {
                                    i2++;
                                }
                            }
                            ru8VarArr4[i2] = ru8Var3;
                        }
                        Bitmap bitmap2 = ru8Var2.b;
                        Utilities.stackBlurBitmap(bitmap2, Math.max(10, bitmap2.getWidth() / jn7.J2));
                        synchronized (ws8Var.b) {
                            if (!ru8Var3.d) {
                                ru8Var3.f = false;
                                ru8Var3.b.eraseColor(0);
                            }
                            ru8Var3.a.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                            ru8Var3.f = true;
                            Bitmap bitmap3 = ru8Var3.b;
                            int i3 = 0;
                            while (true) {
                                ru8[] ru8VarArr6 = ws8Var.c;
                                if (i3 >= ru8VarArr6.length) {
                                    i3 = 0;
                                } else if (ru8VarArr6[i3] != ru8Var2) {
                                    i3++;
                                }
                            }
                            ws8Var.a(i3, bitmap3);
                        }
                        if (!ru8Var2.d) {
                            ru8Var2.f = false;
                            ru8Var2.b.eraseColor(0);
                        }
                        ru8Var2.e = false;
                        if (!ru8Var2.d && ru8Var2.c) {
                            ru8Var2.d = true;
                            ru8Var2.b.recycle();
                        }
                        z = true;
                    }
                }
                if (z && ws8Var.e && ws8Var.h != null) {
                    ws8Var.postInvalidateOnAnimation();
                }
                if (ws8Var.e && (ws8Var.G || ws8Var.I)) {
                    hl.c3(new vs8(ws8Var, b));
                    return;
                } else {
                    ws8Var.e = false;
                    return;
                }
            case 1:
                ws8Var.I = true;
                ws8Var.postInvalidateOnAnimation();
                return;
            default:
                ws8Var.b();
                su8.a.postRunnable(ws8Var.s);
                return;
        }
    }
}
