// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x34 extends d {
    public long a;
    public TLRPC.Chat b;
    public boolean c;
    public boolean d;
    public boolean e;
    public t34 f;
    public qp0 h;

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 15));
        this.simpleActionBar.setTitle(jb6.M0(2131743668, null));
        FrameLayout frameLayout = new FrameLayout(context);
        t34 t34Var = new t34(this, new h92(this, (byte) 27), new yu3(this, (byte) 7), null, (byte) 0);
        this.f = t34Var;
        t34Var.r1();
        this.f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f, qoe.e(-1, -1, nm7.D1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.b = getMessagesController().L0(Long.valueOf(-this.a));
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
