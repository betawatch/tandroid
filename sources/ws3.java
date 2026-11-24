// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ws3 extends FrameLayout implements tjb {
    public boolean E;
    public boolean a;
    public final ts3 b;
    public final wjb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final kl w;
    public int x;
    public final gn y;

    /* JADX WARN: Multi-variable type inference failed */
    public ws3(Context context, cja cjaVar, String str, boolean z, int i, wjb wjbVar) {
        super(context);
        this.f = -1;
        this.r = true;
        Object[] objArr = 0;
        gn gnVar = new gn(false, true, true);
        this.y = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        this.d = i;
        ts3 ts3Var = new ts3(this, context, cjaVar, wjbVar, z);
        this.b = ts3Var;
        gt3 editText = ts3Var.getEditText();
        editText.setDelegate(new tg2(this, editText, false, (byte) 24));
        ts3Var.setWillNotDraw(false);
        this.w = new kl(ts3Var);
        gnVar.setCallback(ts3Var);
        editText.setTextSize(1, 17.0f);
        zkb.D(editText, bkb.G6, wjbVar);
        int i2 = bkb.F6;
        zkb.X(editText, i2, wjbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), gl.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((k96.a0 ? 5 : 3) | 48);
        editText.setInputType((z ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        zkb.l(editText, 30, i2, wjbVar);
        this.c = wjbVar;
        editText.setCursorSize(gl.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new us3(this, i, editText, z));
        editText.setOnFocusChangeListener(new vs3(this, objArr == true ? 1 : 0));
        addView(ts3Var, nme.e(-1, -1, 48));
        c();
    }

    public int a() {
        return vl.f();
    }

    public final void c() {
        int i;
        ts3 ts3Var = this.b;
        if (ts3Var == null || ts3Var.getEditText() == null) {
            return;
        }
        this.x = this.d - getText().length();
        this.y.t(((!TextUtils.isEmpty(getText()) || this.e) && (!this.h || this.n) && ((i = this.f) == -1 || this.x <= i)) ? String.valueOf(this.x) : "", true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(22.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setEmojiViewCacheType(int i) {
        this.b.setEmojiViewCacheType(i);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.h = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.e = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.f = i;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        ts3 ts3Var = this.b;
        ts3Var.setText(charSequence);
        ts3Var.setSelection(ts3Var.getText().length());
        this.a = false;
    }

    @Override // tjb
    public final void updateColors() {
        ts3 ts3Var = this.b;
        if (ts3Var != null) {
            try {
                if (ts3Var.getEditText() != null) {
                    ts3Var.getEditText().setCursorColor(bkb.v0(bkb.F6, this.c));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
