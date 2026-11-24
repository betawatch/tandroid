// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yc2 extends n39 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ zc2 e;

    public yc2(zc2 zc2Var, Context context) {
        this.e = zc2Var;
        if (zc2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        TLRPC.Chat chat;
        int i = s49Var.f;
        zc2 zc2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = zc2Var.Q;
        int i2 = zc2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = zc2Var.O;
        if (!zc2Var.x.creator || ((i2 != 0 && (i2 != 2 || !zc2Var.L)) || i != 4 || s49Var.b() != zc2Var.f0)) {
            if (!zc2Var.J) {
                return false;
            }
            if ((i2 == 0 || i2 == 2) && i == 4) {
                int b = s49Var.b();
                if (b == zc2Var.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = zc2Var.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i2 == 2 && !zc2Var.L) {
                        return false;
                    }
                    if (b == zc2Var.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !zc2Var.F) {
                            return false;
                        }
                    } else {
                        if (b == zc2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b == zc2Var.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b == zc2Var.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b == zc2Var.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b == zc2Var.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b == zc2Var.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b == zc2Var.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b == zc2Var.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b == zc2Var.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b == zc2Var.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b == zc2Var.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b == zc2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b == zc2Var.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b == zc2Var.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b == zc2Var.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b == zc2Var.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b == zc2Var.o0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i == 3 || i == 1 || i == 5 || i == 8 || i == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // w39
    public final int b() {
        return this.e.W;
    }

    @Override // w39
    public final long c(int i) {
        zc2 zc2Var = this.e;
        if (zc2Var.E != 2) {
            return -1L;
        }
        if (i == zc2Var.X) {
            return 1L;
        }
        if (i == zc2Var.Y) {
            return 2L;
        }
        if (i == zc2Var.Z) {
            return 3L;
        }
        if (i == zc2Var.c0) {
            return 4L;
        }
        if (i == zc2Var.d0) {
            return 5L;
        }
        if (i == zc2Var.e0) {
            return 6L;
        }
        if (i == zc2Var.f0) {
            return 7L;
        }
        if (i == zc2Var.g0) {
            return 8L;
        }
        if (i == zc2Var.h0) {
            return 9L;
        }
        if (i == zc2Var.i0) {
            return 10L;
        }
        if (i == zc2Var.p0) {
            return 11L;
        }
        if (i == zc2Var.q0) {
            return 12L;
        }
        if (i == zc2Var.r0) {
            return 13L;
        }
        if (i == zc2Var.s0) {
            return 14L;
        }
        if (i == zc2Var.t0) {
            return 15L;
        }
        if (i == zc2Var.u0) {
            return 16L;
        }
        if (i == zc2Var.v0) {
            return 17L;
        }
        if (i == zc2Var.w0) {
            return 18L;
        }
        if (i == zc2Var.x0) {
            return 19L;
        }
        if (i == zc2Var.z0) {
            return 20L;
        }
        if (i == zc2Var.C0) {
            return 21L;
        }
        if (i == zc2Var.I0) {
            return 22L;
        }
        if (i == zc2Var.J0) {
            return 23L;
        }
        if (i == zc2Var.K0) {
            return 24L;
        }
        if (i == zc2Var.L0) {
            return 25L;
        }
        if (i == zc2Var.M0) {
            return 26L;
        }
        if (i == zc2Var.N0) {
            return 27L;
        }
        if (i == zc2Var.y0) {
            return 28L;
        }
        if (i == zc2Var.n0) {
            return 29L;
        }
        if (i == zc2Var.D0) {
            return 30L;
        }
        if (i == zc2Var.F0) {
            return 31L;
        }
        if (i == zc2Var.E0) {
            return 32L;
        }
        if (i == zc2Var.G0) {
            return 33L;
        }
        if (i == zc2Var.H0) {
            return 34L;
        }
        if (i == zc2Var.A0) {
            return 35L;
        }
        if (i == zc2Var.O0) {
            return 36L;
        }
        if (i == zc2Var.Q0) {
            return 37L;
        }
        if (i == zc2Var.R0) {
            return 38L;
        }
        if (i == zc2Var.S0) {
            return 39L;
        }
        if (i == zc2Var.T0) {
            return 40L;
        }
        if (i == zc2Var.V0) {
            return 41L;
        }
        if (i == zc2Var.W0) {
            return 42L;
        }
        if (i == zc2Var.X0) {
            return 43L;
        }
        if (i == zc2Var.a0) {
            return 44L;
        }
        if (i == zc2Var.j0) {
            return 45L;
        }
        if (i == zc2Var.k0) {
            return 46L;
        }
        if (i == zc2Var.l0) {
            return 47L;
        }
        if (i == zc2Var.m0) {
            return 48L;
        }
        if (i == zc2Var.o0) {
            return 49L;
        }
        return i == zc2Var.b0 ? 50L : 0L;
    }

    @Override // w39
    public final int d(int i) {
        zc2 zc2Var = this.e;
        if (i == zc2Var.I0 || i == zc2Var.K0 || i == zc2Var.J0 || i == zc2Var.C0 || i == zc2Var.D0 || i == zc2Var.F0 || i == zc2Var.E0 || i == zc2Var.H0 || i == zc2Var.G0 || i == zc2Var.k0 || i == zc2Var.Q0 || i == zc2Var.R0 || i == zc2Var.S0 || i == zc2Var.V0 || i == zc2Var.W0 || i == zc2Var.X0) {
            return 10;
        }
        if (i == zc2Var.A0 || i == zc2Var.O0 || i == zc2Var.T0) {
            return 9;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == zc2Var.p0 || i == zc2Var.r0 || i == zc2Var.M0 || i == zc2Var.t0) {
            return 5;
        }
        if (i == 2 || i == zc2Var.v0) {
            return 3;
        }
        if (i == zc2Var.Y || i == zc2Var.Z || i == zc2Var.a0 || i == zc2Var.c0 || i == zc2Var.d0 || i == zc2Var.e0 || i == zc2Var.g0 || i == zc2Var.h0 || i == zc2Var.i0 || i == zc2Var.j0 || i == zc2Var.z0 || i == zc2Var.f0 || i == zc2Var.L0 || i == zc2Var.X || i == zc2Var.n0 || i == zc2Var.l0 || i == zc2Var.o0 || i == zc2Var.b0) {
            return 4;
        }
        if (i == zc2Var.s0 || i == zc2Var.x0 || i == zc2Var.m0) {
            return 1;
        }
        if (i == zc2Var.N0) {
            return 6;
        }
        if (i == zc2Var.w0) {
            return 11;
        }
        return i == zc2Var.y0 ? 8 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x06b2  */
    /* JADX WARN: Type inference failed for: r4v118, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v124, types: [boolean, int] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        zc2 zc2Var = this.e;
        boolean z2 = zc2Var.V;
        boolean z3 = zc2Var.G;
        boolean z4 = zc2Var.F;
        TLRPC.User user = zc2Var.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = zc2Var.O;
        int i3 = zc2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = zc2Var.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = zc2Var.Q;
        int i4 = s49Var.f;
        View view = s49Var.a;
        switch (i4) {
            case 0:
                ((u6c) view).a(i3 == 2 ? k96.L0(2131753153) : null, user);
                break;
            case 1:
                mhb mhbVar = (mhb) view;
                if (i != zc2Var.m0) {
                    if (i != zc2Var.s0) {
                        if (i == zc2Var.x0) {
                            mhbVar.setText(i3 == 0 ? k96.Z(2131751294, (l7c.C(user) && zc2Var.x.creator) ? k96.L0(2131752411) : k96.L0(2131752508)) : k96.Z(2131751264, l7c.q(user)));
                            break;
                        }
                    } else {
                        mhbVar.setText(k96.L0(2131751313));
                        break;
                    }
                } else {
                    mhbVar.setText(k96.L0(2131751297));
                    break;
                }
                break;
            case 2:
                uib uibVar = (uib) view;
                if (i != zc2Var.q0) {
                    if (i == zc2Var.u0) {
                        TextView textView = uibVar.getTextView();
                        int i5 = bkb.F6;
                        zkb.X(textView, i5, null);
                        uibVar.setTag(Integer.valueOf(i5));
                        if (!z4) {
                            uibVar.b(k96.L0(2131751303), false);
                            break;
                        } else {
                            uibVar.b(k96.L0(2131751310), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = uibVar.getTextView();
                    int i6 = bkb.o7;
                    zkb.X(textView2, i6, null);
                    uibVar.setTag(Integer.valueOf(i6));
                    if (i3 != 0) {
                        if (i3 == 1) {
                            uibVar.b(k96.L0(2131743485), false);
                            break;
                        }
                    } else {
                        uibVar.b(k96.L0(2131751293), false);
                        break;
                    }
                }
                break;
            case 3:
                ld5 ld5Var = (ld5) view;
                if (i != 2) {
                    if (i == zc2Var.v0) {
                        ld5Var.setText(k96.L0(2131751295));
                        break;
                    }
                } else if (i3 != 2 && (user == null || !user.bot)) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ld5Var.setText(k96.L0(2131743484));
                            break;
                        }
                    } else {
                        ld5Var.setText(k96.L0(2131751277));
                        break;
                    }
                } else {
                    ld5Var.setText(k96.L0(2131752977));
                    break;
                }
                break;
            case 4:
            case 9:
                final zgb zgbVar = (zgb) view;
                boolean z5 = i3 != 2 || zc2Var.L;
                TLRPC.Chat chat = zc2Var.x;
                boolean z6 = chat != null && chat.creator;
                if (i == zc2Var.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = zc2Var.P;
                    int i7 = (tL_chatBannedRights2.send_photos || tL_chatBannedRights.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights2.send_videos && !tL_chatBannedRights.send_videos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_stickers && !tL_chatBannedRights.send_stickers) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_audios && !tL_chatBannedRights.send_audios) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_docs && !tL_chatBannedRights.send_docs) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_voices && !tL_chatBannedRights.send_voices) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_roundvideos && !tL_chatBannedRights.send_roundvideos) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights.embed_links && !tL_chatBannedRights2.send_plain && !tL_chatBannedRights.send_plain) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_polls && !tL_chatBannedRights.send_polls) {
                        i7++;
                    }
                    if (!tL_chatBannedRights2.send_reactions && !tL_chatBannedRights.send_reactions) {
                        i7++;
                    }
                    zgbVar.d(k96.M0(2131743451, null), i7 > 0, true, true);
                    Locale locale = Locale.US;
                    final byte b = 0;
                    zgbVar.a(new Runnable(this) { // from class: xc2
                        public final /* synthetic */ yc2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            zgb zgbVar2 = zgbVar;
                            yc2 yc2Var = this.b;
                            switch (b2) {
                                case 0:
                                    zc2 zc2Var2 = yc2Var.e;
                                    if (zgbVar2.isEnabled()) {
                                        if (!zc2Var2.a0()) {
                                            boolean z7 = zgbVar2.d.h;
                                            zgbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = zc2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gl.W3(zc2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zc2Var2.getParentActivity());
                                            String M0 = k96.M0(2131743480, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            hdVar.U = k96.M0(2131743478, null);
                                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                            hdVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z8 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z8);
                                        zc2 zc2Var3 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = zc2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gl.W3(zc2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z10 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z10);
                                        zc2 zc2Var4 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = zc2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gl.W3(zc2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, oo1.n(i7, "/10"), !zc2Var.B0);
                    zgbVar.setIcon(zc2Var.a0() ? R.drawable.permission_locked : 0);
                } else if (i == zc2Var.O0) {
                    ?? r4 = tL_chatAdminRights2.post_messages;
                    int i8 = r4;
                    if (tL_chatAdminRights2.edit_messages) {
                        i8 = r4 + 1;
                    }
                    int i9 = i8;
                    if (tL_chatAdminRights2.delete_messages) {
                        i9 = i8 + 1;
                    }
                    zgbVar.d(k96.M0(2131752370, null), i9 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final byte b2 = 1;
                    zgbVar.a(new Runnable(this) { // from class: xc2
                        public final /* synthetic */ yc2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            zgb zgbVar2 = zgbVar;
                            yc2 yc2Var = this.b;
                            switch (b22) {
                                case 0:
                                    zc2 zc2Var2 = yc2Var.e;
                                    if (zgbVar2.isEnabled()) {
                                        if (!zc2Var2.a0()) {
                                            boolean z7 = zgbVar2.d.h;
                                            zgbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = zc2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gl.W3(zc2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zc2Var2.getParentActivity());
                                            String M0 = k96.M0(2131743480, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            hdVar.U = k96.M0(2131743478, null);
                                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                            hdVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z8 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z8);
                                        zc2 zc2Var3 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = zc2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gl.W3(zc2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z10 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z10);
                                        zc2 zc2Var4 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = zc2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gl.W3(zc2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, oo1.n(i9, "/3"), !zc2Var.P0);
                } else if (i == zc2Var.T0) {
                    ?? r42 = tL_chatAdminRights2.post_stories;
                    int i10 = r42;
                    if (tL_chatAdminRights2.edit_stories) {
                        i10 = r42 + 1;
                    }
                    int i11 = i10;
                    if (tL_chatAdminRights2.delete_stories) {
                        i11 = i10 + 1;
                    }
                    zgbVar.d(k96.L0(2131752369), i11 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final byte b3 = 2;
                    zgbVar.a(new Runnable(this) { // from class: xc2
                        public final /* synthetic */ yc2 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b3;
                            zgb zgbVar2 = zgbVar;
                            yc2 yc2Var = this.b;
                            switch (b22) {
                                case 0:
                                    zc2 zc2Var2 = yc2Var.e;
                                    if (zgbVar2.isEnabled()) {
                                        if (!zc2Var2.a0()) {
                                            boolean z7 = zgbVar2.d.h;
                                            zgbVar2.setChecked(!z7);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = zc2Var2.P;
                                            tL_chatBannedRights3.send_media = z7;
                                            tL_chatBannedRights3.send_photos = z7;
                                            tL_chatBannedRights3.send_videos = z7;
                                            tL_chatBannedRights3.send_stickers = z7;
                                            tL_chatBannedRights3.send_gifs = z7;
                                            tL_chatBannedRights3.send_games = z7;
                                            tL_chatBannedRights3.send_inline = z7;
                                            tL_chatBannedRights3.send_audios = z7;
                                            tL_chatBannedRights3.send_docs = z7;
                                            tL_chatBannedRights3.send_voices = z7;
                                            tL_chatBannedRights3.send_roundvideos = z7;
                                            tL_chatBannedRights3.embed_links = z7;
                                            tL_chatBannedRights3.send_polls = z7;
                                            tL_chatBannedRights3.send_reactions = z7;
                                            gl.W3(zc2Var2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zc2Var2.getParentActivity());
                                            String M0 = k96.M0(2131743480, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            hdVar.U = k96.M0(2131743478, null);
                                            alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                            hdVar.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z8 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z8);
                                        zc2 zc2Var3 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = zc2Var3.N;
                                        boolean z9 = !z8;
                                        tL_chatAdminRights3.post_messages = z9;
                                        tL_chatAdminRights3.edit_messages = z9;
                                        tL_chatAdminRights3.delete_messages = z9;
                                        gl.W3(zc2Var3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (zgbVar2.isEnabled()) {
                                        boolean z10 = zgbVar2.d.h;
                                        zgbVar2.setChecked(z10);
                                        zc2 zc2Var4 = yc2Var.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = zc2Var4.N;
                                        boolean z11 = !z10;
                                        tL_chatAdminRights4.post_stories = z11;
                                        tL_chatAdminRights4.edit_stories = z11;
                                        tL_chatAdminRights4.delete_stories = z11;
                                        gl.W3(zc2Var4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, oo1.n(i11, "/3"), !zc2Var.U0);
                } else if (i == zc2Var.X) {
                    zgbVar.c(k96.L0(2131748504), zc2Var.L, true);
                    zgbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                } else if (i == zc2Var.Y) {
                    if (i3 == 0 || i3 == 2) {
                        if (z3) {
                            zgbVar.c(k96.L0(2131751955), z5 && tL_chatAdminRights2.change_info, true);
                        } else if (z4) {
                            zgbVar.c(k96.L0(2131751312), z5 && tL_chatAdminRights2.change_info, true);
                        } else {
                            zgbVar.c(k96.L0(2131751311), (z5 && tL_chatAdminRights2.change_info) || !tL_chatBannedRights.change_info, true);
                        }
                        i2 = 2;
                        if (i3 == 2) {
                            zgbVar.setIcon((tL_chatAdminRights.change_info || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2 && i == zc2Var.z0) {
                            zgbVar.setEnabled((zc2Var.P.view_messages || tL_chatBannedRights.view_messages) ? false : true);
                            break;
                        }
                    } else if (i3 == 1) {
                        zgbVar.c(k96.L0(z3 ? 2131751955 : 2131743477), (zc2Var.P.change_info || tL_chatBannedRights.change_info) ? false : true, zc2Var.n0 != -1);
                        zgbVar.setIcon(tL_chatBannedRights.change_info ? R.drawable.permission_locked : 0);
                    }
                } else if (i == zc2Var.Z) {
                    zgbVar.c(k96.L0(2131751300), z5 && tL_chatAdminRights2.post_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.post_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.b0) {
                    if (l7c.u(user)) {
                        zgbVar.c(k96.L0(z4 ? 2131751315 : 2131751314), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    } else {
                        zgbVar.c(k96.L0(2131751278), z5 && tL_chatAdminRights2.manage_welcome_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.manage_welcome_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.a0) {
                    zgbVar.c(k96.L0(2131751302), z5 && tL_chatAdminRights2.manage_direct_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.manage_direct_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.c0) {
                    zgbVar.c(k96.L0(2131751307), z5 && tL_chatAdminRights2.edit_messages, true);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.edit_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.d0) {
                    if (z4) {
                        zgbVar.c(k96.L0(2131751309), z5 && tL_chatAdminRights2.delete_messages, true);
                    } else {
                        zgbVar.c(k96.L0(2131751304), z5 && tL_chatAdminRights2.delete_messages, true);
                    }
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.delete_messages || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.e0) {
                    zgbVar.c(k96.L0(2131751319), z5 && tL_chatAdminRights2.add_admins, (zc2Var.g0 != -1 && z4) || zc2Var.f0 != -1);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.add_admins || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.f0) {
                    zgbVar.c(k96.L0(2131751291), z5 && tL_chatAdminRights2.anonymous, zc2Var.n0 != -1 || z2);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.anonymous || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.l0) {
                    String L0 = k96.L0(2131751298);
                    TLRPC.ChatFull chatFull = zc2Var.y;
                    if (chatFull != null && user != null) {
                        if ((zc2Var.r ? zc2Var.n : chatFull.guard_bot_id) == user.id) {
                            z = true;
                            zgbVar.c(L0, z, false);
                            i2 = 2;
                            if (i3 == 2) {
                                zgbVar.setIcon(0);
                            }
                            if (i3 == i2) {
                            }
                        }
                    }
                    z = false;
                    zgbVar.c(L0, z, false);
                    i2 = 2;
                    if (i3 == 2) {
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.g0) {
                    zgbVar.c(k96.L0(z3 ? 2131751956 : 2131751316), z5 && tL_chatAdminRights2.ban_users, !z3);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.ban_users || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.o0) {
                    zgbVar.c(k96.L0(2131751954), z5 && tL_chatAdminRights2.manage_linked_peers, true);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.manage_linked_peers || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.L0) {
                    zgbVar.c(k96.L0(2131744664), z5 && tL_chatAdminRights2.manage_call, true);
                    i2 = 2;
                    if (i3 == 2) {
                        zgbVar.setIcon((tL_chatAdminRights.manage_call || z6) ? 0 : R.drawable.permission_locked);
                    }
                    if (i3 == i2) {
                    }
                } else if (i == zc2Var.n0) {
                    if (i3 == 0) {
                        zgbVar.c(k96.L0(2131748500), z5 && tL_chatAdminRights2.manage_topics, z2);
                    } else if (i3 == 1) {
                        zgbVar.c(k96.L0(2131751688), (zc2Var.P.manage_topics || tL_chatBannedRights.manage_topics) ? false : true, z2);
                        zgbVar.setIcon(tL_chatBannedRights.manage_topics ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            zgbVar.c(k96.L0(2131748500), z5 && tL_chatAdminRights2.manage_topics, z2);
                            zgbVar.setIcon((tL_chatAdminRights.manage_topics || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == zc2Var.h0) {
                    if (i3 == 0) {
                        if (hc2.P(3, chat)) {
                            zgbVar.c(k96.L0(2131751318), tL_chatAdminRights2.invite_users, true);
                        } else {
                            zgbVar.c(k96.L0(2131751317), tL_chatAdminRights2.invite_users, true);
                        }
                    } else if (i3 == 1) {
                        zgbVar.c(k96.L0(2131743472), (zc2Var.P.invite_users || tL_chatBannedRights.invite_users) ? false : true, true);
                        zgbVar.setIcon(tL_chatBannedRights.invite_users ? R.drawable.permission_locked : 0);
                    } else {
                        i2 = 2;
                        if (i3 == 2) {
                            zgbVar.c(k96.L0(2131751317), z5 && tL_chatAdminRights2.invite_users, true);
                            zgbVar.setIcon((tL_chatAdminRights.invite_users || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    }
                } else if (i == zc2Var.i0) {
                    if (i3 == 0 || i3 == 2) {
                        zgbVar.c(k96.L0(2131751301), (z5 && tL_chatAdminRights2.pin_messages) || !tL_chatBannedRights.pin_messages, true);
                        i2 = 2;
                        if (i3 == 2) {
                            zgbVar.setIcon((tL_chatAdminRights.pin_messages || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        zgbVar.c(k96.L0(2131743453), (zc2Var.P.pin_messages || tL_chatBannedRights.pin_messages) ? false : true, true);
                        zgbVar.setIcon(tL_chatBannedRights.pin_messages ? R.drawable.permission_locked : 0);
                    }
                } else if (i == zc2Var.j0) {
                    if (i3 == 0 || i3 == 2) {
                        zgbVar.c(k96.L0(2131751305), z5 && tL_chatAdminRights2.manage_ranks, true);
                        i2 = 2;
                        if (i3 == 2) {
                            zgbVar.setIcon((tL_chatAdminRights.manage_ranks || z6) ? 0 : R.drawable.permission_locked);
                        }
                        if (i3 == i2) {
                        }
                    } else if (i3 == 1) {
                        zgbVar.c(k96.L0(2131743474), (zc2Var.P.edit_rank || tL_chatBannedRights.edit_rank) ? false : true, true);
                        zgbVar.setIcon(tL_chatBannedRights.edit_rank ? R.drawable.permission_locked : 0);
                    }
                } else if (i == zc2Var.z0) {
                    zgbVar.c(k96.L0(2131743452), (zc2Var.P.send_plain || tL_chatBannedRights.send_plain) ? false : true, true);
                    zgbVar.setIcon(tL_chatBannedRights.send_plain ? R.drawable.permission_locked : 0);
                }
                i2 = 2;
                if (i3 == i2) {
                }
                break;
            case 5:
                b9a b9aVar = (b9a) view;
                if (i3 != 2 || (i != zc2Var.p0 && i != zc2Var.x0)) {
                    b9aVar.setAlpha(1.0f);
                    break;
                } else {
                    b9aVar.setAlpha(zc2Var.K);
                    break;
                }
                break;
            case 6:
                ghb ghbVar = (ghb) view;
                if (i == zc2Var.N0) {
                    int i12 = zc2Var.P.until_date;
                    ghbVar.c(k96.M0(2131743475, null), (i12 == 0 || Math.abs(((long) i12) - (System.currentTimeMillis() / 1000)) > 315360000) ? k96.M0(2131743445, null) : k96.v(zc2Var.P.until_date), false);
                    break;
                }
                break;
            case 7:
                le8 le8Var = (le8) view;
                String M0 = (l7c.C(user) && zc2Var.x.creator) ? k96.M0(2131752411, null) : k96.M0(2131752508, null);
                this.d = true;
                le8Var.getTextView().setEnabled(zc2Var.J || zc2Var.x.creator);
                le8Var.getTextView().setSingleLine(true);
                le8Var.getTextView().setImeOptions(6);
                le8Var.o(zc2Var.T, M0, false);
                this.d = false;
                break;
            case 10:
                ag2 ag2Var = (ag2) view;
                boolean z7 = ag2Var.getTag() != null && ((Integer) ag2Var.getTag()).intValue() == i;
                ag2Var.setTag(Integer.valueOf(i));
                if (i != zc2Var.I0) {
                    if (i != zc2Var.K0) {
                        if (i != zc2Var.J0) {
                            if (i != zc2Var.C0) {
                                if (i != zc2Var.D0) {
                                    if (i != zc2Var.k0) {
                                        if (i != zc2Var.E0) {
                                            if (i != zc2Var.F0) {
                                                if (i != zc2Var.G0) {
                                                    if (i != zc2Var.H0) {
                                                        if (i != zc2Var.Q0) {
                                                            if (i != zc2Var.R0) {
                                                                if (i != zc2Var.S0) {
                                                                    if (i != zc2Var.V0) {
                                                                        if (i != zc2Var.W0) {
                                                                            if (i == zc2Var.X0) {
                                                                                ag2Var.e(k96.M0(2131751308, null), "", tL_chatAdminRights2.delete_stories, true, z7);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            ag2Var.e(k96.M0(2131751306, null), "", tL_chatAdminRights2.edit_stories, true, z7);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        ag2Var.e(k96.M0(2131751299, null), "", tL_chatAdminRights2.post_stories, true, z7);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    ag2Var.e(k96.M0(2131751309, null), "", tL_chatAdminRights2.delete_messages, true, z7);
                                                                    break;
                                                                }
                                                            } else {
                                                                ag2Var.e(k96.M0(2131751307, null), "", tL_chatAdminRights2.edit_messages, true, z7);
                                                                break;
                                                            }
                                                        } else {
                                                            ag2Var.e(k96.M0(2131751300, null), "", tL_chatAdminRights2.post_messages, true, z7);
                                                            break;
                                                        }
                                                    } else {
                                                        ag2Var.e(k96.M0(2131745414, null), "", (zc2Var.P.send_roundvideos || tL_chatBannedRights.send_roundvideos) ? false : true, true, z7);
                                                        ag2Var.setIcon(tL_chatBannedRights.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    ag2Var.e(k96.M0(2131745411, null), "", (zc2Var.P.send_voices || tL_chatBannedRights.send_voices) ? false : true, true, z7);
                                                    ag2Var.setIcon(tL_chatBannedRights.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                ag2Var.e(k96.M0(2131745417, null), "", (zc2Var.P.send_docs || tL_chatBannedRights.send_docs) ? false : true, true, z7);
                                                ag2Var.setIcon(tL_chatBannedRights.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            ag2Var.e(k96.M0(2131745416, null), "", (zc2Var.P.send_audios || tL_chatBannedRights.send_audios) ? false : true, true, z7);
                                            ag2Var.setIcon(tL_chatBannedRights.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        ag2Var.e(k96.M0(2131743448, null), "", (zc2Var.P.send_reactions || tL_chatBannedRights.send_reactions) ? false : true, true, false);
                                        ag2Var.setIcon(tL_chatBannedRights.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    ag2Var.e(k96.M0(2131745412, null), "", (zc2Var.P.send_videos || tL_chatBannedRights.send_videos) ? false : true, true, z7);
                                    ag2Var.setIcon(tL_chatBannedRights.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                ag2Var.e(k96.M0(2131745415, null), "", (zc2Var.P.send_photos || tL_chatBannedRights.send_photos) ? false : true, true, z7);
                                ag2Var.setIcon(tL_chatBannedRights.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            ag2Var.e(k96.M0(2131745410, null), "", (zc2Var.P.send_polls || tL_chatBannedRights.send_polls) ? false : true, true, z7);
                            ag2Var.setIcon(tL_chatBannedRights.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String M02 = k96.M0(2131743473, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = zc2Var.P;
                        ag2Var.e(M02, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights.embed_links || tL_chatBannedRights3.send_plain || tL_chatBannedRights.send_plain) ? false : true, true, z7);
                        ag2Var.setIcon(tL_chatBannedRights.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    ag2Var.e(k96.M0(2131745413, null), "", (zc2Var.P.send_stickers || tL_chatBannedRights.send_stickers) ? false : true, true, z7);
                    ag2Var.setIcon(tL_chatBannedRights.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((wfb) view).a(zc2Var.w, zc2Var.T, i3 == 0, false, new be2(this, (byte) 22));
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View u6cVar;
        View ld5Var;
        int i2;
        wjb wjbVar;
        Context context = this.c;
        zc2 zc2Var = this.e;
        switch (i) {
            case 0:
                u6cVar = new u6c(context, null);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 1:
                u6cVar = new mhb(context);
                break;
            case 2:
            default:
                u6cVar = new uib(context);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 3:
                ld5Var = new ld5(this.c, bkb.K6, 21, 15, true, null);
                zkb.h(bkb.c6, null, ld5Var);
                u6cVar = ld5Var;
                break;
            case 4:
            case 9:
                u6cVar = new zgb(context);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 5:
                u6cVar = new b9a(context, (de9) null);
                break;
            case 6:
                u6cVar = new ghb(null, context, false);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 7:
                le8 le8Var = new le8(context, 0, null, null);
                zkb.h(bkb.c6, null, le8Var);
                le8Var.c(new b7(this, (byte) 12));
                u6cVar = le8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                zc2Var.d = frameLayout;
                int i3 = bkb.Z6;
                zkb.h(i3, null, frameLayout);
                zc2Var.e = new FrameLayout(context);
                hn hnVar = new hn(context, true, false, false);
                zc2Var.f = hnVar;
                hnVar.setTypeface(gl.o());
                zc2Var.f.setTextColor(-1);
                zc2Var.f.setTextSize(gl.L(14.0f));
                zc2Var.f.setGravity(17);
                hn hnVar2 = zc2Var.f;
                StringBuilder sb = new StringBuilder(k96.M0(2131754456, null));
                sb.append(" ");
                sb.append(k96.M0(zc2Var.L ? 2131754455 : 2131754454, null));
                hnVar2.setText(sb.toString());
                zc2Var.e.addView(zc2Var.f, nme.e(-2, -2, 17));
                zc2Var.e.setBackground(sjb.f(bkb.Ei, 4.0f));
                zc2Var.e.setOnClickListener(new x91(this, (byte) 12));
                zc2Var.d.addView(zc2Var.e, nme.d(-1, 48.0f, kk7.D1, 14.0f, 28.0f, 14.0f, 14.0f));
                zc2Var.d.setLayoutParams(new e49(-1, -2));
                View view = new View(context);
                zkb.h(i3, null, view);
                zc2Var.d.setClipChildren(false);
                zc2Var.d.setClipToPadding(false);
                zc2Var.d.addView(view, nme.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                u6cVar = zc2Var.d;
                break;
            case 10:
                ag2 ag2Var = new ag2(this.c, 4, 21, false, zc2Var.getResourceProvider());
                ag2Var.setPad(1);
                ag2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                ag2Var.setEnabled(true);
                zkb.h(bkb.c6, null, ag2Var);
                u6cVar = ag2Var;
                break;
            case 11:
                i2 = ((d) zc2Var).currentAccount;
                long j = -zc2Var.s;
                wjbVar = ((d) zc2Var).resourceProvider;
                ld5Var = new wfb(i2, j, wjbVar, this.c);
                u6cVar = ld5Var;
                break;
        }
        return new y29(u6cVar);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int b = s49Var.b();
        zc2 zc2Var = this.e;
        if (b == zc2Var.v0) {
            zc2Var.q0(s49Var.a);
        }
    }

    @Override // w39
    public final void z(s49 s49Var) {
        int b = s49Var.b();
        zc2 zc2Var = this.e;
        if (b != zc2Var.w0 || zc2Var.getParentActivity() == null) {
            return;
        }
        gl.t1(zc2Var.getParentActivity().getCurrentFocus());
    }
}
