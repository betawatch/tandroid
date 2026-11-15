package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class d extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new d());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        e eVar = (e) view;
        if (b41Var.G == null) {
            eVar.setAsShowMore((k) b41Var.H);
            return;
        }
        int i7 = b41Var.z;
        String charSequence = b41Var.l.toString();
        View.OnClickListener onClickListener = b41Var.D;
        k kVar = (k) b41Var.H;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i10 = kVar.G;
        int i11 = kVar.I;
        TextView textView = eVar.b;
        textView.setTextColor(i11);
        int r12 = j6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.r1(0.6f, i11), mode));
        imageView2.setBackground(j6.b0(0, j6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i7 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(j6.r1(0.1f, kVar.I));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new e(context);
    }
}
