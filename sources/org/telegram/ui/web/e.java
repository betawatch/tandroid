package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class e extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new e());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        f fVar = (f) view;
        if (f61Var.G == null) {
            fVar.setAsShowMore((l) f61Var.H);
            return;
        }
        int i10 = f61Var.z;
        String charSequence = f61Var.l.toString();
        View.OnClickListener onClickListener = f61Var.D;
        l lVar = (l) f61Var.H;
        ImageView imageView = fVar.a;
        imageView.setVisibility(0);
        int i11 = lVar.F;
        int i12 = lVar.H;
        TextView textView = fVar.b;
        textView.setTextColor(i12);
        int m12 = h6.m1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = fVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.m1(0.6f, i12), mode));
        imageView2.setBackground(h6.a0(0, h6.m1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(h6.m1(0.1f, lVar.H));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new f(context);
    }
}
