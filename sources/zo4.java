// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zo4 implements aq4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zo4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // aq4
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dp4 dp4Var = (dp4) obj2;
                oxb oxbVar = (oxb) obj;
                if (oxbVar == null) {
                    return null;
                }
                if ((dp4Var.b & 2048) == 0 || !wj2.e(oxbVar.g)) {
                    return oxbVar;
                }
                return null;
            case 1:
                pf7 pf7Var = (pf7) obj2;
                oxb oxbVar2 = (oxb) obj;
                if (oxbVar2 == null) {
                    return null;
                }
                if ((pf7Var.b & 1024) == 0 || !wj2.e(oxbVar2.g)) {
                    return oxbVar2;
                }
                return null;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                im5 im5Var = (im5) ((sk4) obj2).c;
                if (!im5Var.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (im5Var.a(height)) {
                    height--;
                }
                if (im5Var.a(width)) {
                    width--;
                }
                return yz.p(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i = ((dd) obj2).b;
                if (width2 > i || bitmap2.getHeight() > i) {
                    float f = i;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return yz.p(bitmap2);
        }
    }
}
