// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ot3 extends FrameLayout implements snb {
    public boolean E;
    public boolean a;
    public final lt3 b;
    public final vnb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final ll w;
    public int x;
    public final hn y;

    /* JADX WARN: Multi-variable type inference failed */
    public ot3(Context context, wma wmaVar, String str, boolean z, int i, vnb vnbVar) {
        super(context);
        this.f = -1;
        this.r = true;
        Object[] objArr = 0;
        hn hnVar = new hn(false, true, true);
        this.y = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        this.d = i;
        lt3 lt3Var = new lt3(this, context, wmaVar, vnbVar, z);
        this.b = lt3Var;
        xt3 editText = lt3Var.getEditText();
        editText.setDelegate(new lh2(this, editText, false, (byte) 24));
        lt3Var.setWillNotDraw(false);
        this.w = new ll(lt3Var);
        hnVar.setCallback(lt3Var);
        editText.setTextSize(1, 17.0f);
        yob.D(editText, aob.H6, vnbVar);
        int i2 = aob.G6;
        yob.X(editText, i2, vnbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), hl.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((ob6.a0 ? 5 : 3) | 48);
        editText.setInputType((z ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        yob.l(editText, 30, i2, vnbVar);
        this.c = vnbVar;
        editText.setCursorSize(hl.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new mt3(this, i, editText, z));
        editText.setOnFocusChangeListener(new nt3(this, objArr == true ? 1 : 0));
        addView(lt3Var, tre.e(-1, -1, 48));
        c();
    }

    public int a() {
        return wl.f();
    }

    public final void c() {
        int i;
        lt3 lt3Var = this.b;
        if (lt3Var == null || lt3Var.getEditText() == null) {
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
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(22.0f) : 0), getMeasuredHeight() - 1, aob.j0);
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
        lt3 lt3Var = this.b;
        lt3Var.setText(charSequence);
        lt3Var.setSelection(lt3Var.getText().length());
        this.a = false;
    }

    @Override // snb
    public final void updateColors() {
        lt3 lt3Var = this.b;
        if (lt3Var != null) {
            try {
                if (lt3Var.getEditText() != null) {
                    lt3Var.getEditText().setCursorColor(aob.v0(aob.G6, this.c));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
