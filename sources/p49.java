// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p49 extends FrameLayout {
    public final i66 a;
    public final l66 b;
    public final CheckBoxSquare c;

    public p49(Context context, ylb ylbVar) {
        super(context);
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(null, context, false);
        this.c = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, qoe.d(18, 18.0f, (jb6.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        i66 i66Var = new i66(this);
        this.a = i66Var;
        l66 l66Var = new l66(context, i66Var, ylbVar);
        this.b = l66Var;
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.I6, ylbVar);
        l66Var.setTextSize(1, 15.0f);
        l66Var.setMaxLines(2);
        l66Var.setGravity((jb6.a0 ? 5 : 3) | 16);
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
        addView(l66Var, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 16.0f : 58.0f, 21.0f, z ? 58.0f : 16.0f, 21.0f));
        setWillNotDraw(false);
    }

    public CheckBoxSquare getCheckBox() {
        return this.c;
    }

    public TextView getTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i66 i66Var = this.a;
        if (i66Var != null) {
            canvas.save();
            l66 l66Var = this.b;
            canvas.translate(l66Var.getLeft(), l66Var.getTop());
            if (i66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    public void setChecked(boolean z) {
        this.c.a(z, true);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
