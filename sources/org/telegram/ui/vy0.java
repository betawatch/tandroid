package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vy0 extends org.telegram.ui.ActionBar.e2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final /* synthetic */ int a;
    public org.telegram.ui.Components.uj0 b;
    public org.telegram.ui.Components.tj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy0(int i7, Bundle bundle) {
        super(bundle);
        this.a = i7;
    }

    public static void Z(vy0 vy0Var, int i7) {
        if (i7 == 5) {
            org.telegram.messenger.np.e1().edit().putBoolean("design_voice_live_transcript", !c8.z0.b()).apply();
            ((l4) vy0Var.c).g(5);
            ((l4) vy0Var.c).g(6);
            return;
        }
        if (i7 == 6) {
            if (c8.z0.b()) {
                org.telegram.messenger.np.e1().edit().putBoolean("design_voice_live_field", !c8.z0.c()).apply();
                ((l4) vy0Var.c).g(6);
                ((l4) vy0Var.c).g(7);
                return;
            }
            return;
        }
        if (i7 != 1) {
            if (MediaController.s0(vy0Var.currentAccount) && i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vy0Var.getParentActivity());
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131753922, null);
                alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131753921, null), org.telegram.messenger.hd.M0(2131753920, null)}, new k4(vy0Var, 0));
                vy0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        aj.a aVar = aj.e.b;
        boolean z10 = !MediaController.s0(vy0Var.currentAccount);
        synchronized (aVar) {
            aVar.d = z10;
            aVar.c = true;
            aVar.b = true;
            aj.d.a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
        }
        ((l4) vy0Var.c).f();
    }

    public static void a0(vy0 vy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.d;
            boolean z10 = !org.telegram.ui.Components.w40.e(vy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.c = true;
                aVar.b = true;
                aj.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((l4) vy0Var.c).f();
            return;
        }
        if (!org.telegram.ui.Components.w40.e(vy0Var.currentAccount)) {
            return;
        }
        int i10 = 0;
        if (i7 == 2) {
            vy0Var.g0(2131745986, new CharSequence[]{"480p", "360p"}, new t70(12));
            return;
        }
        if (i7 == 3) {
            vy0Var.g0(2131745996, new CharSequence[]{org.telegram.messenger.hd.M0(2131745995, null), org.telegram.messenger.hd.M0(2131745993, null), org.telegram.messenger.hd.M0(2131745994, null)}, new t70(13));
            return;
        }
        if (i7 == 4) {
            vy0Var.g0(2131745989, new CharSequence[]{"30 FPS", "60 FPS"}, new t70(14));
            return;
        }
        if (i7 != 5) {
            if (i7 == 8) {
                aj.a aVar2 = aj.e.i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) vy0Var.c).g(i7);
                return;
            }
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[4];
        while (true) {
            int[] iArr = d;
            if (i10 >= 3) {
                vy0Var.g0(2131745997, charSequenceArr, new t70(15));
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

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745985, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 8));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
                this.b = uj0Var;
                uj0Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new v4.b0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.uj0 uj0Var2 = this.b;
                l4 l4Var = new l4(17, this, context);
                this.c = l4Var;
                uj0Var2.setAdapter(l4Var);
                this.b.setOnItemClickListener(new ux0(this, i7));
                frameLayout.addView(this.b, c8.ja.c(-1.0f, -1));
                break;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 24));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.uj0 uj0Var3 = new org.telegram.ui.Components.uj0(context, null);
                this.b = uj0Var3;
                uj0Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new v4.b0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.uj0 uj0Var4 = this.b;
                l4 l4Var2 = new l4(i10, this, context);
                this.c = l4Var2;
                uj0Var4.setAdapter(l4Var2);
                this.b.setOnItemClickListener(new h(this, i7));
                frameLayout2.addView(this.b, c8.ja.c(-1.0f, -1));
                break;
        }
        return this.fragmentView;
    }

    public void g0(int i7, CharSequence[] charSequenceArr, t70 t70Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, t70Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        switch (this.a) {
        }
        return true;
    }
}
