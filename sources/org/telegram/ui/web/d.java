package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new d());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        e eVar = (e) view;
        if (i51Var.G == null) {
            eVar.setAsShowMore((k) i51Var.H);
            return;
        }
        int i10 = i51Var.z;
        String charSequence = i51Var.l.toString();
        View.OnClickListener onClickListener = i51Var.D;
        k kVar = (k) i51Var.H;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i11 = kVar.F;
        int i12 = kVar.H;
        TextView textView = eVar.b;
        textView.setTextColor(i12);
        int l1 = i6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.l1(0.6f, i12), mode));
        imageView2.setBackground(i6.Z(0, i6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(i6.l1(0.1f, kVar.H));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new e(context);
    }
}
