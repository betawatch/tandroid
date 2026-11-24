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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ss5 extends q59 {
    public final /* synthetic */ xs5 c;

    public ss5(xs5 xs5Var) {
        this.c = xs5Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        xs5 xs5Var = this.c;
        if (b == xs5Var.r1) {
            return xs5Var.l1.admin_id != z8c.h(xs5Var.a).n;
        }
        if (b < xs5Var.w1 || b >= xs5Var.x1) {
            return b >= xs5Var.I1 && b < xs5Var.J1;
        }
        return true;
    }

    @Override // y59
    public final int b() {
        return this.c.M1;
    }

    @Override // y59
    public final int d(int i) {
        xs5 xs5Var = this.c;
        if (i == xs5Var.q1 || i == xs5Var.H1 || i == xs5Var.v1 || i == xs5Var.o1) {
            return 0;
        }
        if (i == xs5Var.r1) {
            return 1;
        }
        if (i >= xs5Var.I1 && i < xs5Var.J1) {
            return 1;
        }
        if (i >= xs5Var.w1 && i < xs5Var.x1) {
            return 1;
        }
        if (i == xs5Var.s1 || i == xs5Var.t1) {
            return 2;
        }
        if (i == xs5Var.B1) {
            return 3;
        }
        if (i == xs5Var.C1) {
            return 4;
        }
        if (i == xs5Var.D1) {
            return 5;
        }
        if (i == 0 || i == xs5Var.E1 || i == xs5Var.F1) {
            return 6;
        }
        if (i == xs5Var.u1) {
            return 7;
        }
        if (i == xs5Var.G1) {
            return 8;
        }
        return i == xs5Var.p1 ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
        xs5 xs5Var;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        String str3;
        boolean z4;
        boolean z5;
        boolean z6;
        String format;
        String a0;
        int i4 = u69Var.f;
        if (i4 == 0) {
            l55 l55Var = (l55) u69Var.a;
            xs5 xs5Var2 = this.c;
            if (i == xs5Var2.q1) {
                l55Var.setText(jb6.M0(2131748675, null));
                l55Var.setRightText(null);
                return;
            }
            if (i == xs5Var2.o1) {
                l55Var.setText(jb6.M0(2131748650, null));
                l55Var.setRightText(null);
                return;
            }
            if (i != xs5Var2.v1) {
                if (i == xs5Var2.y1) {
                    l55Var.setText(jb6.G(xs5Var2.l1.subscription_expired, "PeopleSubscriptionExpired", new Object[0]));
                    l55Var.setRightText(null);
                    return;
                } else {
                    if (i == xs5Var2.H1) {
                        l55Var.setText(jb6.G(xs5Var2.l1.requested, "JoinRequests", new Object[0]));
                        l55Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported = xs5Var2.l1;
            int i5 = tL_chatInviteExported.usage;
            if (i5 > 0) {
                l55Var.setText(jb6.G(i5, "PeopleJoined", new Object[0]));
            } else {
                l55Var.setText(jb6.M0(tL_chatInviteExported.subscription_pricing == null ? 2131747921 : 2131747919, null));
            }
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.c.l1;
            if (tL_chatInviteExported2.expired || tL_chatInviteExported2.revoked || (i2 = tL_chatInviteExported2.usage_limit) <= 0 || (i3 = tL_chatInviteExported2.usage) <= 0) {
                l55Var.setRightText(null);
                return;
            } else {
                l55Var.setRightText(jb6.G(i2 - i3, "PeopleJoinedRemaining", new Object[0]));
                return;
            }
        }
        if (i4 != 1) {
            if (i4 == 3) {
                f56 f56Var = (f56) u69Var.a;
                f56Var.d(0, null, false);
                f56Var.setLink(this.c.l1.link);
                f56Var.setRevoke(this.c.l1.revoked);
                f56Var.setPermanent(this.c.l1.permanent);
                f56Var.setCanEdit(this.c.e2);
                f56Var.b(!this.c.e2);
                return;
            }
            if (i4 != 4) {
                if (i4 == 8) {
                    ts5 ts5Var = (ts5) u69Var.a;
                    int i6 = this.c.l1.usage_limit;
                    if (i6 <= 0) {
                        ts5Var.a.setVisibility(8);
                        return;
                    } else {
                        ts5Var.a.setText(jb6.G(i6, "PeopleCanJoinViaLinkCount", new Object[0]));
                        ts5Var.a.setVisibility(0);
                        return;
                    }
                }
                if (i4 == 9) {
                    us5 us5Var = (us5) u69Var.a;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.c.l1;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported3.subscription_pricing;
                    int i7 = tL_chatInviteExported3.usage;
                    us5Var.getClass();
                    if (tL_starsSubscriptionPricing2 != null) {
                        int i8 = tL_starsSubscriptionPricing2.period;
                        if (i8 == 2592000) {
                            us5Var.b.setText(nxa.b1(false, jb6.a0(null, null, 2131748649, Long.valueOf(tL_starsSubscriptionPricing2.amount)).concat(i7 > 0 ? hg9.j(i7, " x ") : ""), 0.8f, null));
                            TextView textView = us5Var.c;
                            if (i7 == 0) {
                                a0 = jb6.M0(2131747919, null);
                            } else {
                                cj0 h = cj0.h();
                                double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                                xs5 xs5Var3 = us5Var.f;
                                int i9 = xs5.h2;
                                a0 = jb6.a0(null, null, 2131748648, h.e((long) (d * oc7.r1(xs5Var3.a).l4.s3.i * i7), "USD"));
                            }
                            textView.setText(a0);
                            return;
                        }
                        String str4 = i8 == 300 ? "5min" : "min";
                        TextView textView2 = us5Var.b;
                        Locale locale = Locale.US;
                        textView2.setText(nxa.b1(false, String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str4).concat(i7 > 0 ? hg9.j(i7, " x ") : ""), 0.8f, null));
                        TextView textView3 = us5Var.c;
                        if (i7 == 0) {
                            format = jb6.M0(2131747919, null);
                        } else {
                            cj0 h2 = cj0.h();
                            double d2 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                            xs5 xs5Var4 = us5Var.f;
                            int i10 = xs5.h2;
                            format = String.format(locale, "you get approximately %1$s %2$s", h2.e((long) (d2 * oc7.r1(xs5Var4.a).l4.s3.i * i7), "USD"), "for ".concat(str4));
                        }
                        textView3.setText(format);
                        return;
                    }
                    return;
                }
                return;
            }
            ws5 ws5Var = (ws5) u69Var.a;
            gm.r(ws5Var.x);
            ws5Var.y = false;
            anb.X(ws5Var.getTextView(), cmb.A6, null);
            ws5Var.setFixedSize(0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.c.l1;
            if (tL_chatInviteExported4.revoked) {
                ws5Var.setText(jb6.M0(2131748658, null));
                return;
            }
            if (tL_chatInviteExported4.expired) {
                int i11 = tL_chatInviteExported4.usage_limit;
                if (i11 > 0 && i11 == tL_chatInviteExported4.usage) {
                    ws5Var.setText(jb6.M0(2131748659, null));
                    return;
                } else {
                    ws5Var.setText(jb6.M0(2131748660, null));
                    anb.X(ws5Var.getTextView(), cmb.o7, null);
                    return;
                }
            }
            if (tL_chatInviteExported4.expire_date <= 0) {
                ws5Var.setFixedSize(-1);
                ws5Var.setText(null);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            xs5 xs5Var5 = this.c;
            long j2 = (xs5Var5.c2 * 1000) + currentTimeMillis;
            long j3 = xs5Var5.l1.expire_date;
            long j4 = (j3 * 1000) - j2;
            if (j4 < 0) {
                j4 = 0;
            }
            if (j4 > 86400000) {
                ws5Var.setText(jb6.a0("LinkExpiresIn", null, 2131748673, jb6.s(j3, false)));
                return;
            }
            long j5 = j4 / 1000;
            int i12 = (int) (j5 % 60);
            long j6 = j5 / 60;
            Locale locale2 = Locale.ENGLISH;
            String str5 = String.format(locale2, "%02d", Integer.valueOf((int) (j6 / 60))) + String.format(locale2, ":%02d", Integer.valueOf((int) (j6 % 60))) + String.format(locale2, ":%02d", Integer.valueOf(i12));
            ws5Var.y = true;
            o04 o04Var = ws5Var.x;
            gm.r(o04Var);
            if (ws5Var.y) {
                gm.d3(o04Var, 500L);
            }
            ws5Var.setText(jb6.a0("LinkExpiresInTime", null, 2131748672, str5));
            return;
        }
        vs5 vs5Var = (vs5) u69Var.a;
        xs5 xs5Var6 = this.c;
        if (i == xs5Var6.r1) {
            j = xs5Var6.l1.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i13 = xs5Var6.w1;
            ArrayList arrayList = xs5Var6.X1;
            int i14 = xs5Var6.z1;
            if (i14 != -1 && i >= i14) {
                arrayList = xs5Var6.Y1;
                i13 = i14;
            }
            int i15 = xs5Var6.I1;
            if (i15 != -1 && i >= i15) {
                arrayList = xs5Var6.Z1;
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
        xs5 xs5Var7 = this.c;
        if (i == xs5Var7.r1) {
            user2 = (TLRPC.User) xs5Var7.m1.get(Long.valueOf(j));
            if (user2 == null) {
                user2 = oc7.r1(this.c.a).W1(Long.valueOf(this.c.l1.admin_id));
            }
            if (user2 != null) {
                str = jb6.s(this.c.l1.date, false);
                user = user2;
                if (i != this.c.r1 && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = jb6.M0(2131752369, "ChannelCreator");
                            }
                            str3 = str6;
                            z4 = false;
                            z5 = true;
                            z6 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = jb6.M0(2131752467, "ChannelAdmin");
                            }
                            z4 = channelParticipant.promoted_by == z8c.h(this.c.a).e();
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
                                str7 = jb6.M0(2131752369, "ChannelCreator");
                            }
                            str2 = str7;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str7)) {
                                str7 = jb6.M0(2131752467, "ChannelAdmin");
                            }
                            String str8 = str7;
                            z = chatParticipant.inviter_id == z8c.h(this.c.a).e();
                            str2 = str8;
                            z3 = false;
                            z2 = true;
                        } else {
                            str2 = str7;
                        }
                    }
                    vs5Var.a(str2, z2, z3, !m9c.D(user) && sd2.h(oc7.r1(this.c.a).L0(Long.valueOf(this.c.a2))), new ns5(this, user, str2, z2, z3, z, (byte) 0));
                    vs5Var.d(user, null, str, false);
                    xs5Var = this.c;
                    if (i == xs5Var.r1 || (tL_starsSubscriptionPricing = xs5Var.l1.subscription_pricing) == null || tL_chatInviteImporter == null) {
                        return;
                    }
                    int i17 = tL_chatInviteImporter.date;
                    TextView textView4 = vs5Var.d0;
                    TextView textView5 = vs5Var.c0;
                    SpannableStringBuilder b1 = nxa.b1(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                    int i18 = tL_starsSubscriptionPricing.period;
                    String M0 = i18 == 2592000 ? jb6.M0(2131744745, null) : i18 == 300 ? "per 5 minutes" : "per each minute";
                    textView5.setText(b1);
                    textView4.setText(M0);
                    vs5Var.h((int) Math.max(hg5.h(b1, textView5.getPaint()), hg5.h(M0, textView4.getPaint())), true);
                    vs5Var.c.l(jb6.B(i17), false);
                    return;
                }
                str2 = null;
                z = false;
                z2 = false;
                z3 = false;
                vs5Var.a(str2, z2, z3, !m9c.D(user) && sd2.h(oc7.r1(this.c.a).L0(Long.valueOf(this.c.a2))), new ns5(this, user, str2, z2, z3, z, (byte) 0));
                vs5Var.d(user, null, str, false);
                xs5Var = this.c;
                if (i == xs5Var.r1) {
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
        vs5Var.a(str2, z2, z3, !m9c.D(user) && sd2.h(oc7.r1(this.c.a).L0(Long.valueOf(this.c.a2))), new ns5(this, user, str2, z2, z3, z, (byte) 0));
        vs5Var.d(user, null, str, false);
        xs5Var = this.c;
        if (i == xs5Var.r1) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        byte b = 10;
        xs5 xs5Var = this.c;
        switch (i) {
            case 1:
                view2 = new vs5(context);
                break;
            case 2:
                int i2 = cmb.Z6;
                View bbaVar = new bba(context, cmb.w0(null, i2, false), 0);
                anb.h(i2, null, bbaVar);
                view2 = bbaVar;
                break;
            case 3:
                os5 os5Var = new os5(this, context, xs5Var.O1, xs5Var, xs5Var.b2);
                os5Var.setDelegate(new rs5(this));
                os5Var.setLayoutParams(new g69(-1, -2));
                view2 = os5Var;
                break;
            case 4:
                view2 = new ws5(xs5Var, context);
                break;
            case 5:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(10);
                tk4Var.x = false;
                tk4Var.setPaddingLeft(gm.L(10.0f));
                view = tk4Var;
                view2 = view;
                break;
            case 6:
                view = new o72(context, b);
                view2 = view;
                break;
            case 7:
                view2 = new bba(context, (hg9) null);
                break;
            case 8:
                ts5 ts5Var = new ts5(context);
                TextView textView = new TextView(context);
                ts5Var.a = textView;
                textView.setTextSize(1, 14.0f);
                anb.X(textView, cmb.x6, null);
                textView.setGravity(1);
                ts5Var.addView(textView, qoe.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = ts5Var;
                break;
            case 9:
                view2 = new us5(xs5Var, context);
                break;
            default:
                view2 = new l55(context, xs5Var.J0);
                break;
        }
        return kt6.h(view2, view2, -1, -2);
    }
}
