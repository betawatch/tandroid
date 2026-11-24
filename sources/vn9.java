// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vn9 extends d {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final /* synthetic */ byte a;
    public r59 b;
    public q59 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn9(Bundle bundle, byte b) {
        super(bundle);
        this.a = b;
    }

    public static String b0(int i) {
        if (i % 1000000 == 0) {
            return (i / 1000000) + " Mbps";
        }
        if (i > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i / 1000000.0f));
        }
        return (i / 1000) + " kbps";
    }

    public final void c0(int i) {
        if (i != 1) {
            if (MediaController.r0(this.currentAccount) && i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131753887, null);
                alertDialog$Builder.e(new CharSequence[]{jb6.M0(2131753886, null), jb6.M0(2131753885, null)}, new r30(this, (byte) 0));
                showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        in0 in0Var = yed.b;
        boolean z = !MediaController.r0(this.currentAccount);
        synchronized (in0Var) {
            in0Var.d = z;
            in0Var.c = true;
            in0Var.b = true;
            jaa.a.edit().putBoolean("audio_recorder_v2_enabled", z).apply();
        }
        ((s30) this.c).f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 4;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(jb6.M0(2131745718, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 10));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                r59 r59Var = new r59(context, null);
                this.b = r59Var;
                r59Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new u46());
                this.b.setVerticalScrollBarEnabled(false);
                r59 r59Var2 = this.b;
                ny0 ny0Var = new ny0(context);
                this.c = ny0Var;
                r59Var2.setAdapter(ny0Var);
                this.b.setOnItemClickListener(new s19(this, b));
                frameLayout.addView(this.b, qoe.c(-1.0f, -1));
                break;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(jb6.M0(2131753884, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, b));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                r59 r59Var3 = new r59(context, null);
                this.b = r59Var3;
                r59Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new u46());
                this.b.setVerticalScrollBarEnabled(false);
                r59 r59Var4 = this.b;
                s30 s30Var = new s30(this, context, b2);
                this.c = s30Var;
                r59Var4.setAdapter(s30Var);
                this.b.setOnItemClickListener(new u(this, (byte) 6));
                frameLayout2.addView(this.b, qoe.c(-1.0f, -1));
                break;
        }
        return this.fragmentView;
    }

    public final void d0(int i, CharSequence[] charSequenceArr, i98 i98Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(i, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.e(charSequenceArr, new ff((Object) this, (Object) i98Var, (byte) 10));
        showDialog(heVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        byte b = this.a;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        byte b = this.a;
        return true;
    }
}
