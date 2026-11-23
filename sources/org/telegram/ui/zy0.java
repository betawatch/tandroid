package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zy0 extends org.telegram.ui.ActionBar.g2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final /* synthetic */ int a;
    public org.telegram.ui.Components.ek0 b;
    public org.telegram.ui.Components.dk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy0(int i7, Bundle bundle) {
        super(bundle);
        this.a = i7;
    }

    public static void Z(zy0 zy0Var, int i7) {
        if (i7 != 1) {
            if (MediaController.s0(zy0Var.currentAccount) && i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zy0Var.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131753919, null);
                alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.N0(2131753918, null), org.telegram.messenger.hd.N0(2131753917, null)}, new k4(zy0Var, 0));
                zy0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        aj.a aVar = aj.e.b;
        boolean z10 = !MediaController.s0(zy0Var.currentAccount);
        synchronized (aVar) {
            aVar.d = z10;
            aVar.c = true;
            aVar.b = true;
            aj.d.a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
        }
        ((l4) zy0Var.c).f();
    }

    public static void a0(zy0 zy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.d;
            boolean z10 = !org.telegram.ui.Components.h50.e(zy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.c = true;
                aVar.b = true;
                aj.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((l4) zy0Var.c).f();
            return;
        }
        if (!org.telegram.ui.Components.h50.e(zy0Var.currentAccount)) {
            return;
        }
        int i10 = 0;
        if (i7 == 2) {
            zy0Var.g0(2131745790, new CharSequence[]{"480p", "360p"}, new m60(13));
            return;
        }
        if (i7 == 3) {
            zy0Var.g0(2131745800, new CharSequence[]{org.telegram.messenger.hd.N0(2131745799, null), org.telegram.messenger.hd.N0(2131745797, null), org.telegram.messenger.hd.N0(2131745798, null)}, new m60(14));
            return;
        }
        if (i7 == 4) {
            zy0Var.g0(2131745793, new CharSequence[]{"30 FPS", "60 FPS"}, new m60(15));
            return;
        }
        if (i7 != 5) {
            if (i7 == 8) {
                aj.a aVar2 = aj.e.i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) zy0Var.c).g(i7);
                return;
            }
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[4];
        while (true) {
            int[] iArr = d;
            if (i10 >= 3) {
                zy0Var.g0(2131745801, charSequenceArr, new m60(16));
                return;
            } else {
                charSequenceArr[i10] = f0(iArr[i10]);
                i10++;
            }
        }
    }

    public static String f0(int i7) {
        if (i7 % 1000000 == 0) {
            return (i7 / 1000000) + " Mbps";
        }
        if (i7 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i7 / 1000000.0f));
        }
        return (i7 / 1000) + " kbps";
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745789, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 10));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
                this.b = ek0Var;
                ek0Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new v4.c0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ek0 ek0Var2 = this.b;
                l4 l4Var = new l4(17, this, context);
                this.c = l4Var;
                ek0Var2.setAdapter(l4Var);
                this.b.setOnItemClickListener(new zx0(this, i7));
                frameLayout.addView(this.b, c8.ma.c(-1.0f, -1));
                break;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131753916, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 26));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.ek0 ek0Var3 = new org.telegram.ui.Components.ek0(context, null);
                this.b = ek0Var3;
                ek0Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new v4.c0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ek0 ek0Var4 = this.b;
                l4 l4Var2 = new l4(i10, this, context);
                this.c = l4Var2;
                ek0Var4.setAdapter(l4Var2);
                this.b.setOnItemClickListener(new h(this, i7));
                frameLayout2.addView(this.b, c8.ma.c(-1.0f, -1));
                break;
        }
        return this.fragmentView;
    }

    public void g0(int i7, CharSequence[] charSequenceArr, m60 m60Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, m60Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        switch (this.a) {
        }
        return true;
    }
}
