package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new d());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        e eVar = (e) view;
        if (n41Var.H == null) {
            eVar.setAsShowMore((k) n41Var.I);
            return;
        }
        int i7 = n41Var.A;
        String charSequence = n41Var.m.toString();
        View.OnClickListener onClickListener = n41Var.E;
        k kVar = (k) n41Var.I;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i10 = kVar.G;
        int i11 = kVar.I;
        TextView textView = eVar.b;
        textView.setTextColor(i11);
        int r12 = n6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, i11), mode));
        imageView2.setBackground(n6.b0(0, n6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i7 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(n6.r1(0.1f, kVar.I));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new e(context);
    }
}
