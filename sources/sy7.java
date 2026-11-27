// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sy7 extends FrameLayout {
    public final e29 a;

    public sy7(Context context) {
        super(context);
        e29 e29Var = new e29(context);
        this.a = e29Var;
        e29Var.setOnClickListener(new am7(this, (byte) 6));
        int L = hl.L(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, L);
        layoutParams.gravity = 1;
        addView(e29Var, layoutParams);
        setPadding(0, hl.L(32.0f), 0, 0);
        setLayoutParams(new r79(-1, -2));
    }
}
