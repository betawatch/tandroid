// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class yu1 extends FrameLayout {
    public yc a;
    public wu1 b;
    public boolean c;

    public final void a(wu1 wu1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = wu1Var;
            wu1Var.setVisibility(8);
            addView(wu1Var, layoutParams);
        }
    }

    public final void b(yc ycVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = ycVar;
            addView(ycVar, layoutParams);
        }
    }

    public wu1 getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z) {
        this.c = z;
        this.a.setVisibility(z ? 8 : 0);
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z) {
        setEditMode(z);
        if (z) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z);
        this.b.a[1].setOnlyIconMode(z);
    }
}
