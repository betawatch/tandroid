package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class c extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new c());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        d dVar = (d) view;
        if (y31Var.G == null) {
            dVar.setAsShowMore((j) y31Var.H);
            return;
        }
        int i7 = y31Var.z;
        String charSequence = y31Var.l.toString();
        View.OnClickListener onClickListener = y31Var.D;
        j jVar = (j) y31Var.H;
        ImageView imageView = dVar.a;
        imageView.setVisibility(0);
        int i10 = jVar.F;
        int i11 = jVar.H;
        TextView textView = dVar.b;
        textView.setTextColor(i11);
        int r12 = l6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(l6.r1(0.6f, i11), mode));
        imageView2.setBackground(l6.b0(0, l6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i7 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(l6.r1(0.1f, jVar.H));
        dVar.e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new d(context);
    }
}
