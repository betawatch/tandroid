package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import fi.u;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.v8;
import org.telegram.ui.ce;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d {
    public final e2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public u e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public b i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public c m;

    public d(TLRPC.Chat chat, e2 e2Var) {
        this.a = e2Var;
        this.b = chat;
        this.c = e2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i7 = this.l;
            e2 e2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i7 == -1 && chat != null) {
                np messagesController = e2Var.getMessagesController();
                long j3 = chat.id;
                this.l = messagesController.f7.getInt("chatPendingRequests" + j3, 0);
            }
            int i10 = this.k;
            int i11 = this.l;
            if (i10 == i11) {
                return;
            }
            if (i11 != 0 && chat != null) {
                e2Var.getMessagesController().F4(0, chat.id);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.e(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout b() {
        if (this.d == null) {
            e2 e2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(e2Var.getParentActivity());
            this.d = frameLayout;
            final int i7 = 0;
            frameLayout.setBackground(j6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            d dVar = this.b;
                            e2 e2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, e2Var2, dVar.b.id);
                            }
                            e2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().F4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(e2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            final int i10 = 1;
            u uVar = new u(i10, e2Var.getParentActivity(), 0 == true ? 1 : 0);
            this.e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            v8 v8Var = this.e.a;
            for (int i11 = 0; i11 < v8Var.c.length; i11++) {
                v8Var.j(0, 0, null);
            }
            this.f.addView(this.e, ja.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(e2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            q6.U(this.g, j6.We, e2Var.getResourceProvider());
            this.g.setTypeface(g0.o());
            this.f.addView(this.g, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(e2Var.getParentActivity());
            int i12 = j6.x7;
            int themedColor = e2Var.getThemedColor(i12);
            y h02 = j6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                q6.Q(this.h, h02, null, q6.g(i12, 25), e2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            q6.s(this.h, j6.Ue, e2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(hd.M0(2131752041, null));
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
                            e2 e2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, e2Var2, dVar.b.id);
                            }
                            e2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().F4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, ja.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ce ceVar) {
        this.m = ceVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        e2 e2Var = this.a;
        if (i7 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                e2Var.getMessagesController().F4(0, chat.id);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i7) {
            this.k = i7;
            this.g.setText(hd.G(i7, "JoinUsersRequests", new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.User a22 = e2Var.getMessagesController().a2((Long) list.get(i10));
                if (a22 != null) {
                    this.e.b(i10, this.c, a22);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
