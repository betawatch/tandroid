// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pn extends qn {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn(String str, byte b) {
        super(str, (byte) 1);
        this.b = b;
    }

    @Override // qn
    public final void b(int i, Object obj) {
        switch (this.b) {
            case 0:
                ((Paint) obj).setAlpha(i);
                break;
            case 1:
                ((Paint) obj).setColor(i);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i);
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((Paint) obj).getAlpha());
            case 1:
                return Integer.valueOf(((Paint) obj).getColor());
            case 2:
                return Integer.valueOf(((Drawable) obj).getAlpha());
            default:
                return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
        }
    }
}
