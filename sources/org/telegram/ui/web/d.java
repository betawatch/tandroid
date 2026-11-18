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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class d extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new d());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        e eVar = (e) view;
        if (l41Var.H == null) {
            eVar.setAsShowMore((k) l41Var.I);
            return;
        }
        int i7 = l41Var.A;
        String charSequence = l41Var.m.toString();
        View.OnClickListener onClickListener = l41Var.E;
        k kVar = (k) l41Var.I;
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

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new e(context);
    }
}
