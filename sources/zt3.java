// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class zt3 extends FrameLayout implements snb {
    public boolean E;
    public final vnb a;
    public int b;
    public boolean c;
    public final yt3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final ll w;
    public int x;
    public final hn y;

    public zt3(Context context, String str, boolean z, boolean z2, int i, vnb vnbVar) {
        super(context);
        this.h = -1;
        this.w = new ll(this);
        byte b = 1;
        hn hnVar = new hn(false, true, true);
        this.y = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        this.e = i;
        yt3 yt3Var = new yt3(this, context, vnbVar, i, vnbVar, z2);
        this.d = yt3Var;
        hnVar.setCallback(yt3Var);
        yt3Var.setTextSize(1, 17.0f);
        yob.D(yt3Var, aob.H6, vnbVar);
        int i2 = aob.G6;
        yob.X(yt3Var, i2, vnbVar);
        yt3Var.setBackground(null);
        if (z) {
            yt3Var.setMaxLines(5);
            yt3Var.setSingleLine(false);
        } else {
            yt3Var.setMaxLines(1);
            yt3Var.setSingleLine(true);
        }
        yt3Var.setPadding(hl.L(21.0f), hl.L(15.0f), hl.L((i > 0 ? 42 : 0) + 21), hl.L(15.0f));
        yt3Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        yt3Var.setInputType((z ? 131072 : 0) | 573441);
        yt3Var.setRawInputType((z ? 131072 : 0) | 573441);
        yt3Var.setHint(str);
        this.a = vnbVar;
        int v0 = aob.v0(i2, vnbVar);
        this.b = v0;
        yt3Var.setCursorColor(v0);
        yt3Var.setCursorSize(hl.L(19.0f));
        yt3Var.setCursorWidth(1.5f);
        yt3Var.addTextChangedListener(new gi(this, i, z));
        yt3Var.setOnFocusChangeListener(new nt3(this, b));
        addView(yt3Var, tre.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        this.y.t(((!TextUtils.isEmpty(getText()) || this.f) && (!this.n || (this.s && !this.r)) && ((i = this.h) == -1 || this.x <= i)) ? String.valueOf(this.x) : "", true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ls6.d0(yac.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(22.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.n = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.f = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.h = i;
        c();
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence h0 = r47.h0(tL_textWithEntities, false);
        yt3 yt3Var = this.d;
        yt3Var.setText(h0);
        yt3Var.setSelection(yt3Var.getText().length());
        this.c = false;
    }

    @Override // snb
    public final void updateColors() {
        yt3 yt3Var = this.d;
        if (yt3Var != null) {
            try {
                int v0 = aob.v0(aob.G6, this.a);
                if (v0 != this.b) {
                    this.b = v0;
                    yt3Var.setCursorColor(v0);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public void a(boolean z) {
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        yt3 yt3Var = this.d;
        yt3Var.setText(charSequence);
        yt3Var.setSelection(yt3Var.getText().length());
        this.c = false;
    }
}
