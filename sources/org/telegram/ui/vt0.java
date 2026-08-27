package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vt0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public vt0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        au0 au0Var = photoViewer.d;
        if (au0Var == null || au0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) o1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        w5Var.f = dp;
        org.telegram.ui.Components.bp bpVar = w5Var.c;
        org.telegram.ui.Components.n9 n9Var = w5Var.a;
        ag.w wVar = w5Var.e;
        w5Var.h = dp2;
        ((FrameLayout.LayoutParams) w5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) n9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) wVar.getLayoutParams()).rightMargin = dp2;
        n9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                w5Var.setTag(searchImage);
                w5Var.setImage(searchImage);
                wVar.setVisibility(4);
                bpVar.a.f(-1, true, false);
                bpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        w5Var.setTag(photoEntry);
        wVar.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            n9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            n9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                n9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                wVar.setVisibility(0);
                w5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                n9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            n9Var.setImageResource(R.drawable.nophotos);
        }
        bpVar.a.f(-1, true, false);
        bpVar.setVisibility(0);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context);
        new Paint();
        w5Var.setWillNotDraw(false);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        w5Var.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w5Var.addView(n9Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        w5Var.b = frameLayout;
        w5Var.addView(frameLayout, h7.z5.e(42, 42, 53));
        ag.w wVar = new ag.w(context);
        wVar.d = new Path();
        wVar.c = new float[8];
        wVar.e = new RectF();
        wVar.b = new Paint(1);
        w5Var.e = wVar;
        wVar.setWillNotDraw(false);
        wVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        w5Var.addView(wVar, h7.z5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        wVar.addView(imageView, h7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        w5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        wVar.addView(textView, h7.z5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 24, null);
        w5Var.c = bpVar;
        bpVar.setDrawBackgroundAsArc(11);
        bpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        w5Var.addView(bpVar, h7.z5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        bpVar.setVisibility(0);
        w5Var.setFocusable(true);
        frameLayout.setOnClickListener(new u50(this, 21));
        return new org.telegram.ui.Components.lk0(w5Var);
    }
}
