// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uq5 extends n39 {
    public final /* synthetic */ zq5 c;

    public uq5(zq5 zq5Var) {
        this.c = zq5Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        zq5 zq5Var = this.c;
        if (b == zq5Var.r1) {
            return zq5Var.l1.admin_id != y6c.h(zq5Var.a).n;
        }
        if (b < zq5Var.w1 || b >= zq5Var.x1) {
            return b >= zq5Var.I1 && b < zq5Var.J1;
        }
        return true;
    }

    @Override // w39
    public final int b() {
        return this.c.M1;
    }

    @Override // w39
    public final int d(int i) {
        zq5 zq5Var = this.c;
        if (i == zq5Var.q1 || i == zq5Var.H1 || i == zq5Var.v1 || i == zq5Var.o1) {
            return 0;
        }
        if (i == zq5Var.r1) {
            return 1;
        }
        if (i >= zq5Var.I1 && i < zq5Var.J1) {
            return 1;
        }
        if (i >= zq5Var.w1 && i < zq5Var.x1) {
            return 1;
        }
        if (i == zq5Var.s1 || i == zq5Var.t1) {
            return 2;
        }
        if (i == zq5Var.B1) {
            return 3;
        }
        if (i == zq5Var.C1) {
            return 4;
        }
        if (i == zq5Var.D1) {
            return 5;
        }
        if (i == 0 || i == zq5Var.E1 || i == zq5Var.F1) {
            return 6;
        }
        if (i == zq5Var.u1) {
            return 7;
        }
        if (i == zq5Var.G1) {
            return 8;
        }
        return i == zq5Var.p1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        long j;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        zq5 zq5Var;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        String str3;
        boolean z4;
        boolean z5;
        boolean z6;
        String format;
        String a0;
        int i4 = s49Var.f;
        if (i4 == 0) {
            l35 l35Var = (l35) s49Var.a;
            zq5 zq5Var2 = this.c;
            if (i == zq5Var2.q1) {
                l35Var.setText(k96.M0(2131748726, null));
                l35Var.setRightText(null);
                return;
            }
            if (i == zq5Var2.o1) {
                l35Var.setText(k96.M0(2131748701, null));
                l35Var.setRightText(null);
                return;
            }
            if (i != zq5Var2.v1) {
                if (i == zq5Var2.y1) {
                    l35Var.setText(k96.G(zq5Var2.l1.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    l35Var.setRightText(null);
                    return;
                } else {
                    if (i == zq5Var2.H1) {
                        l35Var.setText(k96.G(zq5Var2.l1.requested, "JoinRequests", new Object[0]));
                        l35Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported = zq5Var2.l1;
            int i5 = tL_chatInviteExported.usage;
            if (i5 > 0) {
                l35Var.setText(k96.G(i5, "PeopleJoined", new Object[0]));
            } else {
                l35Var.setText(k96.M0(tL_chatInviteExported.subscription_pricing == null ? 2131747995 : 2131747993, null));
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c.l1;
            if (tL_chatInviteExported2.expired || tL_chatInviteExported2.revoked || (i2 = tL_chatInviteExported2.usage_limit) <= 0 || (i3 = tL_chatInviteExported2.usage) <= 0) {
                l35Var.setRightText(null);
                return;
            } else {
                l35Var.setRightText(k96.G(i2 - i3, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i4 != 1) {
            if (i4 == 3) {
                f36 f36Var = (f36) s49Var.a;
                f36Var.d(0, null, false);
                f36Var.setLink(this.c.l1.link);
                f36Var.setRevoke(this.c.l1.revoked);
                f36Var.setPermanent(this.c.l1.permanent);
                f36Var.setCanEdit(this.c.e2);
                f36Var.b(!this.c.e2);
                return;
            }
            if (i4 != 4) {
                if (i4 == 8) {
                    vq5 vq5Var = (vq5) s49Var.a;
                    int i6 = this.c.l1.usage_limit;
                    if (i6 <= 0) {
                        vq5Var.a.setVisibility(8);
                        return;
                    } else {
                        vq5Var.a.setText(k96.G(i6, "PeopleCanJoinViaLinkCount", new Object[0]));
                        vq5Var.a.setVisibility(0);
                        return;
                    }
                }
                if (i4 == 9) {
                    wq5 wq5Var = (wq5) s49Var.a;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c.l1;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported3.subscription_pricing;
                    int i7 = tL_chatInviteExported3.usage;
                    wq5Var.getClass();
                    if (tL_starsSubscriptionPricing2 != null) {
                        int i8 = tL_starsSubscriptionPricing2.period;
                        if (i8 == 2592000) {
                            wq5Var.b.setText(jva.a1(false, k96.a0(null, null, 2131748700, Long.valueOf(tL_starsSubscriptionPricing2.amount)).concat(i7 > 0 ? de9.k(i7, " x ") : ""), 0.8f, null));
                            TextView textView = wq5Var.c;
                            if (i7 == 0) {
                                a0 = k96.M0(2131747993, null);
                            } else {
                                ci0 h = ci0.h();
                                double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                                zq5 zq5Var3 = wq5Var.f;
                                int i9 = zq5.h2;
                                a0 = k96.a0(null, null, 2131748699, h.e((long) (d * na7.q1(zq5Var3.a).k4.s3.i * i7), "USD"));
                            }
                            textView.setText(a0);
                            return;
                        }
                        String str4 = i8 == 300 ? "5min" : "min";
                        TextView textView2 = wq5Var.b;
                        Locale locale = Locale.US;
                        textView2.setText(jva.a1(false, String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str4).concat(i7 > 0 ? de9.k(i7, " x ") : ""), 0.8f, null));
                        TextView textView3 = wq5Var.c;
                        if (i7 == 0) {
                            format = k96.M0(2131747993, null);
                        } else {
                            ci0 h2 = ci0.h();
                            double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                            zq5 zq5Var4 = wq5Var.f;
                            int i10 = zq5.h2;
                            format = String.format(locale, "you get approximately %1$s %2$s", h2.e((long) (d2 * na7.q1(zq5Var4.a).k4.s3.i * i7), "USD"), "for ".concat(str4));
                        }
                        textView3.setText(format);
                        return;
                    }
                    return;
                }
                return;
            }
            yq5 yq5Var = (yq5) s49Var.a;
            gl.r(yq5Var.x);
            yq5Var.y = false;
            zkb.X(yq5Var.getTextView(), bkb.A6, null);
            yq5Var.setFixedSize(0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.c.l1;
            if (tL_chatInviteExported4.revoked) {
                yq5Var.setText(k96.M0(2131748709, null));
                return;
            }
            if (tL_chatInviteExported4.expired) {
                int i11 = tL_chatInviteExported4.usage_limit;
                if (i11 > 0 && i11 == tL_chatInviteExported4.usage) {
                    yq5Var.setText(k96.M0(2131748710, null));
                    return;
                } else {
                    yq5Var.setText(k96.M0(2131748711, null));
                    zkb.X(yq5Var.getTextView(), bkb.o7, null);
                    return;
                }
            }
            if (tL_chatInviteExported4.expire_date <= 0) {
                yq5Var.setFixedSize(-1);
                yq5Var.setText(null);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            zq5 zq5Var5 = this.c;
            long j2 = (zq5Var5.c2 * 1000) + currentTimeMillis;
            long j3 = zq5Var5.l1.expire_date;
            long j4 = (j3 * 1000) - j2;
            if (j4 < 0) {
                j4 = 0;
            }
            if (j4 > 86400000) {
                yq5Var.setText(k96.a0("LinkExpiresIn", null, 2131748724, k96.s(j3, false)));
                return;
            }
            long j5 = j4 / 1000;
            int i12 = (int) (j5 % 60);
            long j6 = j5 / 60;
            Locale locale2 = Locale.ENGLISH;
            String str5 = String.format(locale2, "%02d", Integer.valueOf((int) (j6 / 60))) + String.format(locale2, ":%02d", Integer.valueOf((int) (j6 % 60))) + String.format(locale2, ":%02d", Integer.valueOf(i12));
            yq5Var.y = true;
            ez3 ez3Var = yq5Var.x;
            gl.r(ez3Var);
            if (yq5Var.y) {
                gl.d3(ez3Var, 500L);
            }
            yq5Var.setText(k96.a0("LinkExpiresInTime", null, 2131748723, str5));
            return;
        }
        xq5 xq5Var = (xq5) s49Var.a;
        zq5 zq5Var6 = this.c;
        if (i == zq5Var6.r1) {
            j = zq5Var6.l1.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i13 = zq5Var6.w1;
            ArrayList arrayList = zq5Var6.X1;
            int i14 = zq5Var6.z1;
            if (i14 != -1 && i >= i14) {
                arrayList = zq5Var6.Y1;
                i13 = i14;
            }
            int i15 = zq5Var6.I1;
            if (i15 != -1 && i >= i15) {
                arrayList = zq5Var6.Z1;
                i13 = i15;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i - i13);
            j = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) this.c.m1.get(Long.valueOf(j));
        TLRPC.ChatFull chatFull = this.c.n1;
        if (chatFull != null && chatFull.participants != null) {
            for (int i16 = 0; i16 < this.c.n1.participants.participants.size(); i16++) {
                if (this.c.n1.participants.participants.get(i16).user_id == j) {
                    chatParticipant = this.c.n1.participants.participants.get(i16);
                    break;
                }
            }
        }
        chatParticipant = null;
        zq5 zq5Var7 = this.c;
        if (i == zq5Var7.r1) {
            user2 = (TLRPC.User) zq5Var7.m1.get(Long.valueOf(j));
            if (user2 == null) {
                user2 = na7.q1(this.c.a).V1(Long.valueOf(this.c.l1.admin_id));
            }
            if (user2 != null) {
                str = k96.s(this.c.l1.date, false);
                user = user2;
                if (i != this.c.r1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = k96.M0(2131752411, "ChannelCreator");
                            }
                            str3 = str6;
                            z4 = false;
                            z5 = true;
                            z6 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = k96.M0(2131752508, "ChannelAdmin");
                            }
                            z4 = channelParticipant.promoted_by == y6c.h(this.c.a).e();
                            str3 = str6;
                            z6 = false;
                            z5 = true;
                        } else {
                            str3 = str6;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                        }
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str2 = str3;
                    } else {
                        String str7 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str7)) {
                                str7 = k96.M0(2131752411, "ChannelCreator");
                            }
                            str2 = str7;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str7)) {
                                str7 = k96.M0(2131752508, "ChannelAdmin");
                            }
                            String str8 = str7;
                            z = chatParticipant.inviter_id == y6c.h(this.c.a).e();
                            str2 = str8;
                            z3 = false;
                            z2 = true;
                        } else {
                            str2 = str7;
                        }
                    }
                    xq5Var.a(str2, z2, z3, !l7c.D(user) && hc2.h(na7.q1(this.c.a).K0(Long.valueOf(this.c.a2))), new pq5(this, user, str2, z2, z3, z, (byte) 0));
                    xq5Var.d(user, null, str, false);
                    zq5Var = this.c;
                    if (i == zq5Var.r1 || (tL_starsSubscriptionPricing = zq5Var.l1.subscription_pricing) == null || tL_chatInviteImporter == null) {
                        return;
                    }
                    int i17 = tL_chatInviteImporter.date;
                    TextView textView4 = xq5Var.d0;
                    TextView textView5 = xq5Var.c0;
                    SpannableStringBuilder a1 = jva.a1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                    int i18 = tL_starsSubscriptionPricing.period;
                    String M0 = i18 == 2592000 ? k96.M0(2131744819, null) : i18 == 300 ? "per 5 minutes" : "per each minute";
                    textView5.setText(a1);
                    textView4.setText(M0);
                    xq5Var.h((int) Math.max(je5.h(a1, textView5.getPaint()), je5.h(M0, textView4.getPaint())), true);
                    xq5Var.c.l(k96.B(i17), false);
                    return;
                }
                str2 = null;
                z = false;
                z2 = false;
                z3 = false;
                xq5Var.a(str2, z2, z3, !l7c.D(user) && hc2.h(na7.q1(this.c.a).K0(Long.valueOf(this.c.a2))), new pq5(this, user, str2, z2, z3, z, (byte) 0));
                xq5Var.d(user, null, str, false);
                zq5Var = this.c;
                if (i == zq5Var.r1) {
                    return;
                } else {
                    return;
                }
            }
        }
        user = user2;
        str = null;
        if (i != this.c.r1) {
        }
        str2 = null;
        z = false;
        z2 = false;
        z3 = false;
        xq5Var.a(str2, z2, z3, !l7c.D(user) && hc2.h(na7.q1(this.c.a).K0(Long.valueOf(this.c.a2))), new pq5(this, user, str2, z2, z3, z, (byte) 0));
        xq5Var.d(user, null, str, false);
        zq5Var = this.c;
        if (i == zq5Var.r1) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        byte b = 10;
        zq5 zq5Var = this.c;
        switch (i) {
            case 1:
                view2 = new xq5(context);
                break;
            case 2:
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.w0(null, i2, false), 0);
                zkb.h(i2, null, b9aVar);
                view2 = b9aVar;
                break;
            case 3:
                qq5 qq5Var = new qq5(this, context, zq5Var.O1, zq5Var, zq5Var.b2);
                qq5Var.setDelegate(new tq5(this));
                qq5Var.setLayoutParams(new e49(-1, -2));
                view2 = qq5Var;
                break;
            case 4:
                view2 = new yq5(zq5Var, context);
                break;
            case 5:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(10);
                pi4Var.x = false;
                pi4Var.setPaddingLeft(gl.L(10.0f));
                view = pi4Var;
                view2 = view;
                break;
            case 6:
                view = new d62(context, b);
                view2 = view;
                break;
            case 7:
                view2 = new b9a(context, (de9) null);
                break;
            case 8:
                vq5 vq5Var = new vq5(context);
                TextView textView = new TextView(context);
                vq5Var.a = textView;
                textView.setTextSize(1, 14.0f);
                zkb.X(textView, bkb.x6, null);
                textView.setGravity(1);
                vq5Var.addView(textView, nme.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = vq5Var;
                break;
            case 9:
                view2 = new wq5(zq5Var, context);
                break;
            default:
                view2 = new l35(context, zq5Var.J0);
                break;
        }
        return ls6.h(view2, view2, -1, -2);
    }
}
