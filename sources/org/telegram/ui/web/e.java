package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class e extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new e());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        f fVar = (f) view;
        if (h51Var.G == null) {
            fVar.setAsShowMore((l) h51Var.H);
            return;
        }
        int i10 = h51Var.z;
        String charSequence = h51Var.l.toString();
        View.OnClickListener onClickListener = h51Var.D;
        l lVar = (l) h51Var.H;
        ImageView imageView = fVar.a;
        imageView.setVisibility(0);
        int i11 = lVar.F;
        int i12 = lVar.H;
        TextView textView = fVar.b;
        textView.setTextColor(i12);
        int l1 = j6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = fVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.l1(0.6f, i12), mode));
        imageView2.setBackground(j6.Z(0, j6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(j6.l1(0.1f, lVar.H));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new f(context);
    }
}
