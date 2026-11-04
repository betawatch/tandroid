package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.v;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.w8;
import org.telegram.ui.de;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d {
    public final d2 a;
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

    public d(TLRPC.Chat chat, d2 d2Var) {
        this.a = d2Var;
        this.b = chat;
        this.c = d2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i3 = this.l;
            d2 d2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i3 == -1 && chat != null) {
                hp messagesController = d2Var.getMessagesController();
                long j10 = chat.id;
                this.l = messagesController.e7.getInt("chatPendingRequests" + j10, 0);
            }
            int i10 = this.k;
            int i11 = this.l;
            if (i10 == i11) {
                return;
            }
            if (i11 != 0 && chat != null) {
                d2Var.getMessagesController().E4(0, chat.id);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.c(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout b() {
        if (this.d == null) {
            d2 d2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(d2Var.getParentActivity());
            this.d = frameLayout;
            final int i3 = 0;
            frameLayout.setBackground(k6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            d dVar = this.b;
                            d2 d2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, d2Var2, dVar.b.id);
                            }
                            d2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().E4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(d2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            final int i10 = 1;
            v vVar = new v(i10, d2Var.getParentActivity(), 0 == true ? 1 : 0);
            this.e = vVar;
            vVar.setAvatarsTextSize(g0.L(18.0f));
            w8 w8Var = this.e.a;
            for (int i11 = 0; i11 < w8Var.c.length; i11++) {
                w8Var.j(0, 0, null);
            }
            this.f.addView(this.e, mf.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(d2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            r6.V(this.g, k6.Te, d2Var.getResourceProvider());
            this.g.setTypeface(g0.o());
            this.f.addView(this.g, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(d2Var.getParentActivity());
            int i12 = k6.x7;
            int themedColor = d2Var.getThemedColor(i12);
            y h02 = k6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                r6.R(this.h, h02, null, r6.h(i12, 25), d2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            r6.t(this.h, k6.Re, d2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(bd.M0(2131752041, null));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            d2 d2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, d2Var2, dVar.b.id);
                            }
                            d2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().E4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, mf.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(de deVar) {
        this.m = deVar;
    }

    public final void d(int i3, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        d2 d2Var = this.a;
        if (i3 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                d2Var.getMessagesController().E4(0, chat.id);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i3) {
            this.k = i3;
            this.g.setText(bd.G(i3, "JoinUsersRequests", new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.User a22 = d2Var.getMessagesController().a2((Long) list.get(i10));
                if (a22 != null) {
                    this.e.b(i10, this.c, a22);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
