package yh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.v;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l9;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d {
    public final r2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public v e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public b i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public c m;

    public d(TLRPC.Chat chat, r2 r2Var) {
        this.a = r2Var;
        this.b = chat;
        this.c = r2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i10 = this.l;
            r2 r2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i10 == -1 && chat != null) {
                this.l = r2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.id);
            }
            int i11 = this.k;
            int i12 = this.l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.d(z10, z11);
        }
    }

    public final FrameLayout b() {
        if (this.d == null) {
            r2 r2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(r2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(y6.M0(false));
            final int i10 = 0;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: yh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            r2 r2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, r2Var2, dVar.b.id);
                            }
                            r2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().setChatPendingRequestsOnClose(dVar2.b.id, dVar2.k);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(r2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, kb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            v vVar = new v(1, r2Var.getParentActivity(), false);
            this.e = vVar;
            vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            l9 l9Var = this.e.a;
            for (int i11 = 0; i11 < l9Var.c.length; i11++) {
                l9Var.l(0, null, 0);
            }
            this.f.addView(this.e, kb1.h(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(r2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            f7.V(this.g, y6.fe, r2Var.getResourceProvider());
            this.g.setTypeface(AndroidUtilities.bold());
            this.f.addView(this.g, kb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(r2Var.getParentActivity());
            int i12 = y6.x7;
            int themedColor = r2Var.getThemedColor(i12);
            y g02 = y6.g0(436207615 & themedColor, 1, AndroidUtilities.dp(14.0f));
            if ((themedColor >>> 24) == 255) {
                f7.R(this.h, g02, null, f7.h(i12, 25), r2Var.getResourceProvider());
            } else {
                this.h.setBackground(g02);
            }
            f7.t(this.h, y6.de, r2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            final int i13 = 1;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: yh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            d dVar = this.b;
                            r2 r2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, r2Var2, dVar.b.id);
                            }
                            r2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().setChatPendingRequestsOnClose(dVar2.b.id, dVar2.k);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, kb1.h(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(qe qeVar) {
        this.m = qeVar;
    }

    public final void d(int i10, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        r2 r2Var = this.a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                r2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i10) {
            this.k = i10;
            this.g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i11 = 0; i11 < min; i11++) {
                TLRPC.User user = r2Var.getMessagesController().getUser((Long) list.get(i11));
                if (user != null) {
                    this.e.b(i11, user, this.c);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
