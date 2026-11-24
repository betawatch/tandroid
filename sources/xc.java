// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xc extends ScrollView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(Context context, l65 l65Var) {
        super(context, null, 0, R.style.scrollbarShapeStyle);
        this.a = (byte) 1;
        this.b = l65Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j);
                BitmapDrawable[] bitmapDrawableArr = ((hd) this.b).E;
                if (bitmapDrawableArr[0].getPaint().getAlpha() != 0) {
                    bitmapDrawableArr[0].setBounds(0, getScrollY(), getMeasuredWidth(), gl.L(3.0f) + getScrollY());
                    bitmapDrawableArr[0].draw(canvas);
                }
                if (bitmapDrawableArr[1].getPaint().getAlpha() != 0) {
                    bitmapDrawableArr[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - gl.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    bitmapDrawableArr[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.onMeasure(i, i2);
                setMeasuredDimension(((l65) obj).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 2:
                jr5 jr5Var = (jr5) obj;
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (gl.O1() || size2 > size) {
                    L = gl.L(144.0f);
                    jr5Var.m2 = L;
                } else {
                    L = gl.L(56.0f);
                    jr5Var.m2 = L;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
                break;
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                ((vx7) obj).t0 = View.MeasureSpec.getSize(i2) - gl.L(30.0f);
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                int i = ((mf6) obj).a;
                if (i == 1 || i == 2 || i == 4) {
                    rect.bottom = gl.L(40.0f) + rect.bottom;
                }
                break;
            case 4:
                byte b2 = ((vx7) obj).J1;
                if (b2 == 1 || b2 == 2 || b2 == 4) {
                    rect.bottom = gl.L(40.0f) + rect.bottom;
                }
                break;
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (!usersSelectActivity.w) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = de9.w(20.0f, usersSelectActivity.S, rect.top);
                    rect.bottom = de9.w(50.0f, usersSelectActivity.S, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.w = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(gk7 gk7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = gk7Var;
    }
}
