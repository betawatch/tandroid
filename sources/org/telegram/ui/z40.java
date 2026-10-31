package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z40 extends LinearLayout {
    public final org.telegram.ui.Components.f6 a;
    public float b;
    public final /* synthetic */ b50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(b50 b50Var, Context context) {
        super(context);
        this.c = b50Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, false, false);
        this.a = f6Var;
        f6Var.setTextColor(-1);
        f6Var.setTextSize(org.telegram.messenger.i0.L(46.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131743472, null));
        addView(f6Var, w7.b6.o(-1, 46));
        addView(textView, w7.b6.o(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String E = org.telegram.messenger.cd.E(i10, ',');
        org.telegram.ui.Components.f6 f6Var = this.a;
        float measureText = f6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i11 = org.telegram.ui.ActionBar.t6.zk;
            b50 b50Var = this.c;
            f6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.w0(i11, b50Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bk, b50Var.I0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        f6Var.setText(E);
    }
}
