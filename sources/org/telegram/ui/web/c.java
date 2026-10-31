package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new c());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        d dVar = (d) view;
        if (a51Var.G == null) {
            dVar.setAsShowMore((j) a51Var.H);
            return;
        }
        int i10 = a51Var.z;
        String charSequence = a51Var.l.toString();
        View.OnClickListener onClickListener = a51Var.D;
        j jVar = (j) a51Var.H;
        ImageView imageView = dVar.a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.b;
        textView.setTextColor(i12);
        int r12 = t6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(t6.r1(0.6f, i12), mode));
        imageView2.setBackground(t6.b0(0, t6.r1(0.15f, i12), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(t6.r1(0.1f, jVar.H));
        dVar.e = z10;
        dVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new d(context);
    }
}
