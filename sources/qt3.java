// default package

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qt3 extends ShapeDrawable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ EditTextBoldCursor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt3(EditTextBoldCursor editTextBoldCursor, RectShape rectShape) {
        super(rectShape);
        this.b = editTextBoldCursor;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                super.draw(canvas);
                editTextBoldCursor.H0 = true;
                break;
            default:
                if (!editTextBoldCursor.e1) {
                    super.draw(canvas);
                    break;
                } else {
                    editTextBoldCursor.H0 = true;
                    break;
                }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return hl.L(this.b.j0 + 20);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return hl.L(this.b.F0);
            default:
                return super.getIntrinsicWidth();
        }
    }

    public qt3(EditTextBoldCursor editTextBoldCursor) {
        this.b = editTextBoldCursor;
    }
}
