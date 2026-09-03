package ph;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l7 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public ArrayList c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final rl0 f;
    public final k7 h;
    public final TextView n;

    public l7(Context context, final int i10, boolean z4, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.b = i10;
        this.c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new i7(this, context, f6Var);
        rl0 rl0Var = new rl0(context, f6Var);
        this.f = rl0Var;
        int i11 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i11, 0, i11, 0);
        k7 k7Var = new k7(this);
        this.h = k7Var;
        rl0Var.setAdapter(k7Var);
        rl0Var.setLayoutManager(new f2.i0());
        this.containerView.addView(rl0Var, k7.b6.e(-1, -1, 119));
        rl0Var.setOnItemClickListener(new hl0() { // from class: ph.h7
            @Override // org.telegram.ui.Components.hl0
            public final void d(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                l7 l7Var = l7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) l7Var.c.get(i12 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    l7Var.dismiss();
                    return;
                }
                Context context2 = l7Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var2);
                d2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new eg.f0(d2Var, callback2, inputPeer2, 2), true, f6Var2);
                l7Var.dismiss();
            }
        });
        rl0Var.setOnScrollListener(new j7(this));
        TextView textView = new TextView(getContext());
        this.n = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z4 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, k7.b6.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return s() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.c = MessagesController.getInstance(this.b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            rl0 rl0Var = this.f;
            if (i10 >= rl0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = rl0Var.getChildAt(i10);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }
}
