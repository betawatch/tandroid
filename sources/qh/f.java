package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import cg.u;
import dg.n;
import f2.l;
import fg.i;
import k7.b6;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
import ph.d4;
import ph.f3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final lf.a U;
    public final u V;
    public final FrameLayout W;
    public Runnable X;
    public w51 Y;

    public f(Context context, f6 f6Var, lf.a aVar, boolean z4, Runnable runnable) {
        super(context, null, false, false, false, 1, f6Var);
        this.v = 0.2f;
        this.X = runnable;
        fixNavigationBar();
        rl0 rl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        rl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n(this, 18));
        l lVar = new l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(j6.v0(j6.h5, f6Var));
        this.U = aVar;
        u uVar = new u(context, 4, f6Var);
        this.V = uVar;
        final int i12 = 1;
        ((TextView) uVar.c).setText(LocaleController.formatString(R.string.TonNeededTitle, lf.a.i(aVar.b - t7.y(this.currentAccount, true).s().b, lf.b.b).d()));
        TextView textView = (TextView) uVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        ph.d dVar = new ph.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, b6.t(-1, 48, 17, 20, 10, 20, 20));
        if (z4 || g.B0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ze.d.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ze.d.u(this.b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        w51 w51Var = this.Y;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w51 w51Var = this.Y;
            if (w51Var != null) {
                w51Var.N(true);
            }
            lf.a s6 = t7.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.V.c;
            int i12 = R.string.TonNeededTitle;
            lf.a aVar = this.U;
            textView.setText(LocaleController.formatString(i12, lf.a.i(aVar.b - s6.b, lf.b.b).d()));
            pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (s6.b < aVar.b || (runnable = this.X) == null) {
                return;
            }
            runnable.run();
            this.X = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        u uVar = this.V;
        if (uVar != null) {
            ((i) uVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        lk lkVar;
        if (t7.y(this.currentAccount, true).s().b >= this.U.b) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
                return;
            }
            return;
        }
        p2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.x9() && (lkVar = znVar.V) != null) {
                lkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new d4(this, 6), this.resourcesProvider);
        this.Y = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        u uVar = this.V;
        if (uVar == null) {
            return null;
        }
        return ((TextView) uVar.c).getText();
    }
}
