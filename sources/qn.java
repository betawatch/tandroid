// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qn extends rn {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn(String str, byte b) {
        super(str, (byte) 1);
        this.b = b;
    }

    @Override // rn
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
