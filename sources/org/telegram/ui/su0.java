package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class su0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public su0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.a0) {
            i16 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.i5.r(i16).t(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i10 || b10 == privacyControlActivity.Y) {
            return true;
        }
        i11 = privacyControlActivity.photoForRestRow;
        if (b10 == i11) {
            return true;
        }
        i12 = privacyControlActivity.readRow;
        if (b10 == i12) {
            return true;
        }
        i13 = privacyControlActivity.showGiftIconRow;
        if (b10 == i13 || b10 == privacyControlActivity.d0 || b10 == privacyControlActivity.m0 || b10 == privacyControlActivity.n0 || b10 == privacyControlActivity.o0 || b10 == privacyControlActivity.l0 || b10 == privacyControlActivity.k0) {
            return true;
        }
        if (privacyControlActivity.x == 12 && privacyControlActivity.y0()) {
            return false;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (b10 == i14 || b10 == privacyControlActivity.N || b10 == privacyControlActivity.f0) {
            return true;
        }
        i15 = privacyControlActivity.everybodyRow;
        return b10 == i15 || b10 == privacyControlActivity.S || b10 == privacyControlActivity.R;
    }

    public final int E(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (longValue > 0) {
                i10++;
            } else {
                TLRPC.Chat L0 = this.d.getMessagesController().L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    i10 += L0.participants_count;
                }
            }
        }
        return i10;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.q0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 == privacyControlActivity.R || i10 == privacyControlActivity.S || i10 == privacyControlActivity.a0 || i10 == privacyControlActivity.d0) {
            return 0;
        }
        if (i10 == privacyControlActivity.T || i10 == privacyControlActivity.O || i10 == privacyControlActivity.P || i10 == privacyControlActivity.i0 || i10 == privacyControlActivity.b0 || i10 == privacyControlActivity.Y || i10 == privacyControlActivity.c0 || i10 == privacyControlActivity.e0) {
            return 1;
        }
        i11 = privacyControlActivity.setBirthdayRow;
        if (i10 == i11 || i10 == privacyControlActivity.j0 || i10 == privacyControlActivity.p0) {
            return 1;
        }
        if (i10 == privacyControlActivity.M || i10 == privacyControlActivity.g0 || i10 == privacyControlActivity.Q || i10 == privacyControlActivity.Z || i10 == privacyControlActivity.U) {
            return 2;
        }
        i12 = privacyControlActivity.giftTypesHeaderRow;
        if (i10 == i12) {
            return 2;
        }
        i13 = privacyControlActivity.everybodyRow;
        if (i10 == i13 || i10 == privacyControlActivity.N) {
            return 3;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (i10 == i14 || i10 == privacyControlActivity.f0 || i10 == privacyControlActivity.V || i10 == privacyControlActivity.W) {
            return 3;
        }
        if (i10 == privacyControlActivity.L) {
            return 4;
        }
        if (i10 == privacyControlActivity.X) {
            return 5;
        }
        i15 = privacyControlActivity.photoForRestRow;
        if (i10 == i15) {
            return 6;
        }
        i16 = privacyControlActivity.currentPhotoForRestRow;
        if (i10 == i16) {
            return 7;
        }
        i17 = privacyControlActivity.readRow;
        if (i10 == i17) {
            return 8;
        }
        i18 = privacyControlActivity.showGiftIconRow;
        if (i10 == i18 || i10 == privacyControlActivity.m0 || i10 == privacyControlActivity.n0 || i10 == privacyControlActivity.o0 || i10 == privacyControlActivity.k0 || i10 == privacyControlActivity.l0) {
            return 8;
        }
        i19 = privacyControlActivity.priceRow;
        if (i10 == i19) {
            return 9;
        }
        return i10 == privacyControlActivity.h0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.D;
        int i23 = privacyControlActivity.x;
        int i24 = c1Var.f;
        View view = c1Var.a;
        final int i25 = 1;
        r9 = 0;
        int i26 = 0;
        r9 = 0;
        int i27 = 0;
        r9 = 0;
        int i28 = 0;
        r9 = 0;
        int i29 = 0;
        r9 = 0;
        int i30 = 0;
        if (i24 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.G6, privacyControlActivity.getResourceProvider());
            if (i10 == privacyControlActivity.R) {
                String G = privacyControlActivity.F.size() != 0 ? org.telegram.messenger.cd.G(E(privacyControlActivity.F), "Users", new Object[0]) : org.telegram.messenger.cd.L0(2131751162, null);
                if (privacyControlActivity.y[privacyControlActivity.H == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.F;
                    G = (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.cd.a0(null, null, 2131746795, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131746794, G);
                }
                if (i23 != 10) {
                    int i31 = privacyControlActivity.H;
                    if (zArr[i31] && i31 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.F;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? org.telegram.messenger.cd.a0(null, null, 2131746782, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131746781, G);
                    }
                }
                if (i23 == 10) {
                    x9Var.c(org.telegram.messenger.cd.L0(2131746764, null), G, false, false);
                } else if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                    x9Var.c(org.telegram.messenger.cd.L0(2131754268, null), G, false, privacyControlActivity.S != -1);
                } else {
                    x9Var.c(org.telegram.messenger.cd.L0(2131754269, null), G, false, privacyControlActivity.S != -1);
                }
                if (i23 == 12) {
                    x9Var.setEnabled(!privacyControlActivity.y0());
                    return;
                }
                return;
            }
            if (i10 != privacyControlActivity.S) {
                if (i10 == privacyControlActivity.a0) {
                    i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
                    x9Var.c(org.telegram.messenger.cd.L0(2131746814, null), org.telegram.messenger.i5.r(i11).t(3) ? org.telegram.messenger.cd.L0(2131748789, null) : PrivacySettingsActivity.B0(privacyControlActivity.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i10 == privacyControlActivity.d0) {
                        x9Var.b(org.telegram.messenger.cd.L0(privacyControlActivity.getUserConfig().q() ? 2131746828 : 2131746829, null), false);
                        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.n6, privacyControlActivity.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.G.size() != 0 ? org.telegram.messenger.cd.G(E(privacyControlActivity.G), "Users", new Object[0]) : org.telegram.messenger.cd.L0(2131751162, null);
            int i32 = privacyControlActivity.H;
            if (zArr[i32] && i32 == 0) {
                ArrayList arrayList3 = privacyControlActivity.G;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? org.telegram.messenger.cd.a0(null, null, 2131746782, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131746781, G2);
            }
            if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                x9Var.c(org.telegram.messenger.cd.L0(2131748305, null), G2, false, false);
            } else {
                x9Var.c(org.telegram.messenger.cd.L0(2131748306, null), G2, false, false);
            }
            if (i23 == 12) {
                x9Var.setEnabled(!privacyControlActivity.y0());
                return;
            }
            return;
        }
        if (i24 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == privacyControlActivity.P) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746765, null));
            } else {
                int i33 = privacyControlActivity.O;
                if (i10 == i33 && i23 == 10) {
                    String L0 = org.telegram.messenger.cd.L0(2131746823, null);
                    final int i34 = r9 ? 1 : 0;
                    b9Var.setText(org.telegram.messenger.i0.T2(L0, new Runnable(this) { // from class: org.telegram.ui.qu0
                        public final /* synthetic */ su0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i35 = i34;
                            su0 su0Var = this.b;
                            switch (i35) {
                                case 0:
                                    su0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity2 = su0Var.d;
                                    privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), null, new ru0(su0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }));
                } else if (i10 == i33 && i23 == 8) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131746772, null));
                } else {
                    i12 = privacyControlActivity.setBirthdayRow;
                    if (i10 == i12) {
                        b9Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131746872, null), new Runnable(this) { // from class: org.telegram.ui.qu0
                            public final /* synthetic */ su0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i35 = i25;
                                su0 su0Var = this.b;
                                switch (i35) {
                                    case 0:
                                        su0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity2 = su0Var.d;
                                        privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), null, new ru0(su0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i10 == privacyControlActivity.O) {
                        if (i23 == 6) {
                            if (privacyControlActivity.H == 1 && privacyControlActivity.I == 1) {
                                b9Var.setText(org.telegram.messenger.cd.L0(2131746802, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String h = sc.e.h("https://t.me/+", privacyControlActivity.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(h);
                                spannableString.setSpan(new org.telegram.ui.Cells.h(9, this, h), 0, h.length(), 33);
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131746804, null)).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.cd.L0(2131746801, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                b9Var.setText(spannableStringBuilder);
                            }
                        } else if (i23 == 5) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746849, null));
                        } else if (i23 == 4) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746791, null));
                        } else if (i23 == 9) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746880, null));
                        } else if (i23 == 14) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746817, null));
                        } else if (i23 == 11) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746874, null));
                        } else if (i23 == 12) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746843, null));
                        } else if (i23 == 3) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746863, null));
                        } else if (i23 == 2) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131742905, null));
                        } else if (i23 == 1) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131742907, null));
                        } else {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751686, null));
                        }
                    } else if (i10 == privacyControlActivity.T) {
                        if (i23 == 6) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746803, null));
                        } else if (i23 == 5) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746848, null));
                        } else if (i23 == 4) {
                            int i35 = privacyControlActivity.H;
                            if (i35 == 2) {
                                b9Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131746788, null)));
                            } else if (i35 == 0) {
                                b9Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131746790, null)));
                            } else {
                                b9Var.setText(org.telegram.messenger.cd.L0(2131746789, null));
                            }
                        } else if (i23 == 3) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751684, null));
                        } else if (i23 == 9) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746881, null));
                        } else if (i23 == 14) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746818, null));
                        } else if (i23 == 11) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746873, null));
                        } else if (i23 == 2) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751687, null));
                        } else if (i23 == 1) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751682, null));
                        } else if (i23 == 12) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751683, null));
                        } else if (i23 == 8) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746771, null));
                        } else if (i23 == 10) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131746762, null));
                        } else {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131751681, null));
                        }
                    } else if (i10 == privacyControlActivity.Y) {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131747282, null));
                    } else if (i10 == privacyControlActivity.c0) {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131749321, null));
                    } else if (i10 == privacyControlActivity.e0) {
                        b9Var.setText(org.telegram.messenger.cd.L0(privacyControlActivity.getUserConfig().q() ? 2131746826 : 2131746827, null));
                    } else if (i10 == privacyControlActivity.i0) {
                        b9Var.setText(org.telegram.messenger.cd.a0(null, null, 2131746760, xh.i.I0(privacyControlActivity.getMessagesController().K6), String.valueOf(((int) (((privacyControlActivity.K * (privacyControlActivity.getMessagesController().K6 / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().d6)) / 100.0d)));
                    } else if (i10 == privacyControlActivity.j0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.msg_input_gift, 0);
                        dqVar.H = 0.583f;
                        dqVar.I = 0.583f;
                        spannableString2.setSpan(dqVar, 0, 1, 33);
                        b9Var.setText(org.telegram.messenger.cd.V(null, null, 2131746841, spannableString2));
                    } else if (i10 == privacyControlActivity.p0) {
                        b9Var.setText(org.telegram.messenger.cd.L0(2131746837, null));
                    }
                }
            }
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, b9Var, null);
            return;
        }
        if (i24 == 2) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (i10 != privacyControlActivity.M) {
                if (i10 == privacyControlActivity.Q) {
                    if (i23 == 10) {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131746763, null));
                        return;
                    } else {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131754431, null));
                        return;
                    }
                }
                if (i10 == privacyControlActivity.Z) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746813, null));
                    return;
                }
                if (i10 == privacyControlActivity.U) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746799, null));
                    return;
                }
                if (i10 == privacyControlActivity.g0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746761, null));
                    return;
                }
                i13 = privacyControlActivity.giftTypesHeaderRow;
                if (i10 == i13) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746838, null));
                    return;
                }
                return;
            }
            if (i23 == 6) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746800, null));
                return;
            }
            if (i23 == 5) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746845, null));
                return;
            }
            if (i23 == 4) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746787, null));
                return;
            }
            if (i23 == 9) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746879, null));
                return;
            }
            if (i23 == 14) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746816, null));
                return;
            }
            if (i23 == 3) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131747770, null));
                return;
            }
            if (i23 == 2) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131742906, null));
                return;
            }
            if (i23 == 1) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131742908, null));
                return;
            }
            if (i23 == 8) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746769, null));
                return;
            }
            if (i23 == 10) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746822, null));
                return;
            }
            if (i23 == 11) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746869, null));
                return;
            } else if (i23 == 12) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746840, null));
                return;
            } else {
                p4Var.setText(org.telegram.messenger.cd.L0(2131749022, null));
                return;
            }
        }
        if (i24 != 3) {
            if (i24 != 8) {
                if (i24 != 9) {
                    return;
                }
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                i22 = privacyControlActivity.priceRow;
                if (i10 == i22) {
                    int[] a2 = org.telegram.ui.Cells.x7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) privacyControlActivity.getMessagesController().J6);
                    tj0 tj0Var = new tj0(this, 9);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = tj0Var;
                    x7Var.d((int) Utilities.k(privacyControlActivity.K, privacyControlActivity.getMessagesController().J6, 1L), w7Var, new ru0(this, r9 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setCheckBoxIcon(0);
            i20 = privacyControlActivity.readRow;
            if (i10 == i20) {
                t8Var.f(org.telegram.messenger.cd.L0(2131749322, null), privacyControlActivity.A0, false);
                return;
            }
            i21 = privacyControlActivity.showGiftIconRow;
            if (i10 == i21) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746842, null), privacyControlActivity.C0, false);
                return;
            }
            if (i10 == privacyControlActivity.k0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746833, null), privacyControlActivity.E0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.E0) {
                    i26 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i10 == privacyControlActivity.l0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746836, null), privacyControlActivity.G0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.G0) {
                    i27 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i10 == privacyControlActivity.m0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746834, null), privacyControlActivity.I0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.I0) {
                    i28 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i10 == privacyControlActivity.n0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746839, null), privacyControlActivity.K0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.K0) {
                    i29 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i10 == privacyControlActivity.o0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131746835, null), privacyControlActivity.M0, false);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.M0) {
                    i30 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i30);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
        m6Var.setRadioIcon(null);
        i14 = privacyControlActivity.everybodyRow;
        if (i10 != i14 && i10 != privacyControlActivity.N) {
            i19 = privacyControlActivity.nobodyRow;
            if (i10 != i19 && i10 != privacyControlActivity.f0) {
                if (i10 == privacyControlActivity.W) {
                    m6Var.c(org.telegram.messenger.cd.L0(2131749039, null), privacyControlActivity.I == 1, false);
                } else if (i10 == privacyControlActivity.V) {
                    m6Var.c(org.telegram.messenger.cd.L0(2131749029, null), privacyControlActivity.I == 0, true);
                }
                if (i23 != 12) {
                    m6Var.b(null, !privacyControlActivity.y0());
                    return;
                }
                return;
            }
        }
        i15 = privacyControlActivity.everybodyRow;
        if (i10 == i15) {
            if (i23 == 3) {
                m6Var.c(org.telegram.messenger.cd.L0(2131747769, null), privacyControlActivity.H == 0, true);
            } else {
                m6Var.c(org.telegram.messenger.cd.L0(2131749029, null), privacyControlActivity.H == 0, true);
            }
        } else if (i10 == privacyControlActivity.N) {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().q()) || (i23 == 10 && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q())) {
                m6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                String L02 = org.telegram.messenger.cd.L0(2131747774, null);
                boolean z10 = privacyControlActivity.H == 2;
                i18 = privacyControlActivity.nobodyRow;
                m6Var.c(L02, z10, (i18 == -1 && privacyControlActivity.f0 == -1) ? false : true);
            } else if (i23 == 10) {
                String L03 = org.telegram.messenger.cd.L0(2131746824, null);
                boolean z11 = privacyControlActivity.H == 2;
                i17 = privacyControlActivity.nobodyRow;
                m6Var.c(L03, z11, (i17 == -1 && privacyControlActivity.f0 == -1) ? false : true);
            } else {
                String L04 = org.telegram.messenger.cd.L0(2131749039, null);
                boolean z12 = privacyControlActivity.H == 2;
                i16 = privacyControlActivity.nobodyRow;
                m6Var.c(L04, z12, (i16 == -1 && privacyControlActivity.f0 == -1) ? false : true);
            }
        } else if (i10 == privacyControlActivity.f0) {
            if (i23 == 10 && !privacyControlActivity.getUserConfig().q()) {
                m6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            m6Var.c(org.telegram.messenger.cd.L0(2131746766, null), privacyControlActivity.H == 3, false);
        } else {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().q()) || (i23 == 10 && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q())) {
                m6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                m6Var.c(org.telegram.messenger.cd.L0(2131747767, null), privacyControlActivity.H == 1, false);
            } else {
                m6Var.c(org.telegram.messenger.cd.L0(2131749026, null), privacyControlActivity.H == 1, false);
            }
        }
        if (i23 != 12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b9Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.Cells.x9 x9Var;
        org.telegram.ui.ActionBar.p6 p6Var3;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                x9Var2.setCanDisable(true);
                x9Var = x9Var2;
                b9Var = x9Var;
                break;
            case 1:
                b9Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                b9Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 3:
                b9Var = new org.telegram.ui.Cells.m6(context, null);
                break;
            case 4:
                b9Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                b9Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(privacyControlActivity.getParentActivity());
                privacyControlActivity.t0 = p8Var;
                if (privacyControlActivity.w0 == null) {
                    p8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.a0(null, null, 2131745534, new Object[0]), false);
                } else {
                    p8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.a0("UpdatePhotoForRest", null, 2131743843, new Object[0]), true);
                }
                privacyControlActivity.t0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                privacyControlActivity.t0.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                privacyControlActivity.s0 = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                privacyControlActivity.t0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                privacyControlActivity.t0.e.setAnimation(privacyControlActivity.s0);
                b9Var = privacyControlActivity.t0;
                break;
            case 7:
                privacyControlActivity.u0 = new org.telegram.ui.Components.g9(privacyControlActivity.getParentActivity());
                privacyControlActivity.v0 = new ls(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.w0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.x0;
                    if (photo != null) {
                        org.telegram.ui.Components.g9 g9Var = privacyControlActivity.u0;
                        org.telegram.messenger.ic i13 = org.telegram.messenger.ic.i(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
                        g9Var.j(i13, "50_50", null, org.telegram.messenger.d20.i(i12).f());
                    } else {
                        org.telegram.ui.Components.g9 g9Var2 = privacyControlActivity.u0;
                        org.telegram.messenger.ic e = org.telegram.messenger.ic.e(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).currentAccount;
                        g9Var2.j(e, "50_50", null, org.telegram.messenger.d20.i(i11).f());
                    }
                }
                privacyControlActivity.v0.addView(privacyControlActivity.u0, w7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.v0.k(org.telegram.messenger.cd.L0(2131746304, null), false);
                privacyControlActivity.v0.getImageView().setVisibility(0);
                privacyControlActivity.v0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                ls lsVar = privacyControlActivity.v0;
                int i14 = org.telegram.ui.ActionBar.t6.p7;
                lsVar.g(i14, i14);
                b9Var = privacyControlActivity.v0;
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                b9Var = new org.telegram.ui.Cells.t8(context, p6Var);
                break;
            case 9:
                p6Var2 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                b9Var = new org.telegram.ui.Cells.x7(context, p6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                p6Var3 = ((org.telegram.ui.ActionBar.k2) privacyControlActivity).resourceProvider;
                vh.d dVar = new vh.d(context, p6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131746767, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new f50(this, 26));
                frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 18.0f, 0.0f, 18.0f, 16.0f));
                x9Var = frameLayout;
                b9Var = x9Var;
                break;
        }
        return new org.telegram.ui.Components.ck0(b9Var);
    }
}
