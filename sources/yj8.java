// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yj8 extends n39 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public yj8(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = s49Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b == privacyControlActivity.d0) {
            i7 = ((d) privacyControlActivity).currentAccount;
            if (!qu2.r(i7).t(3)) {
                return true;
            }
        }
        i = privacyControlActivity.currentPhotoForRestRow;
        if (b == i || b == privacyControlActivity.b0) {
            return true;
        }
        i2 = privacyControlActivity.photoForRestRow;
        if (b == i2) {
            return true;
        }
        i3 = privacyControlActivity.readRow;
        if (b == i3) {
            return true;
        }
        i4 = privacyControlActivity.showGiftIconRow;
        if (b == i4 || b == privacyControlActivity.g0 || b == privacyControlActivity.p0 || b == privacyControlActivity.q0 || b == privacyControlActivity.r0 || b == privacyControlActivity.o0 || b == privacyControlActivity.n0) {
            return true;
        }
        if (privacyControlActivity.E == 12 && privacyControlActivity.x0()) {
            return false;
        }
        i5 = privacyControlActivity.nobodyRow;
        if (b == i5 || b == privacyControlActivity.Q || b == privacyControlActivity.i0) {
            return true;
        }
        i6 = privacyControlActivity.everybodyRow;
        return b == i6 || b == privacyControlActivity.V || b == privacyControlActivity.U;
    }

    public final int E(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (longValue > 0) {
                i++;
            } else {
                TLRPC.Chat K0 = this.d.getMessagesController().K0(Long.valueOf(-longValue));
                if (K0 != null) {
                    i += K0.participants_count;
                }
            }
        }
        return i;
    }

    @Override // w39
    public final int b() {
        return this.d.t0;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i == privacyControlActivity.U || i == privacyControlActivity.V || i == privacyControlActivity.d0 || i == privacyControlActivity.g0) {
            return 0;
        }
        if (i == privacyControlActivity.W || i == privacyControlActivity.R || i == privacyControlActivity.S || i == privacyControlActivity.l0 || i == privacyControlActivity.e0 || i == privacyControlActivity.b0 || i == privacyControlActivity.f0 || i == privacyControlActivity.h0) {
            return 1;
        }
        i2 = privacyControlActivity.setBirthdayRow;
        if (i == i2 || i == privacyControlActivity.m0 || i == privacyControlActivity.s0) {
            return 1;
        }
        if (i == privacyControlActivity.P || i == privacyControlActivity.j0 || i == privacyControlActivity.T || i == privacyControlActivity.c0 || i == privacyControlActivity.X) {
            return 2;
        }
        i3 = privacyControlActivity.giftTypesHeaderRow;
        if (i == i3) {
            return 2;
        }
        i4 = privacyControlActivity.everybodyRow;
        if (i == i4 || i == privacyControlActivity.Q) {
            return 3;
        }
        i5 = privacyControlActivity.nobodyRow;
        if (i == i5 || i == privacyControlActivity.i0 || i == privacyControlActivity.Y || i == privacyControlActivity.Z) {
            return 3;
        }
        if (i == privacyControlActivity.O) {
            return 4;
        }
        if (i == privacyControlActivity.a0) {
            return 5;
        }
        i6 = privacyControlActivity.photoForRestRow;
        if (i == i6) {
            return 6;
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (i == i7) {
            return 7;
        }
        i8 = privacyControlActivity.readRow;
        if (i == i8) {
            return 8;
        }
        i9 = privacyControlActivity.showGiftIconRow;
        if (i == i9 || i == privacyControlActivity.p0 || i == privacyControlActivity.q0 || i == privacyControlActivity.r0 || i == privacyControlActivity.n0 || i == privacyControlActivity.o0) {
            return 8;
        }
        i10 = privacyControlActivity.priceRow;
        if (i == i10) {
            return 9;
        }
        return i == privacyControlActivity.k0 ? 10 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0235, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x031b, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = s49Var.f;
        final byte b = 1;
        r14 = 0;
        int i16 = 0;
        r14 = 0;
        int i17 = 0;
        r14 = 0;
        int i18 = 0;
        r14 = 0;
        int i19 = 0;
        r14 = 0;
        int i20 = 0;
        if (i15 == 0) {
            uib uibVar = (uib) s49Var.a;
            zkb.X(uibVar.getTextView(), bkb.F6, this.d.getResourceProvider());
            PrivacyControlActivity privacyControlActivity = this.d;
            if (i == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? k96.G(E(this.d.I), "Users", new Object[0]) : k96.M0(2131751149, null);
                PrivacyControlActivity privacyControlActivity2 = this.d;
                if (privacyControlActivity2.F[privacyControlActivity2.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity2.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? k96.a0(null, null, 2131746589, new Object[0]) : k96.a0(null, null, 2131746588, G);
                }
                PrivacyControlActivity privacyControlActivity3 = this.d;
                if (privacyControlActivity3.E != 10) {
                    boolean[] zArr = privacyControlActivity3.G;
                    byte b2 = privacyControlActivity3.K;
                    if (zArr[b2] && b2 != 0) {
                        ArrayList arrayList2 = privacyControlActivity3.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? k96.a0(null, null, 2131746576, new Object[0]) : k96.a0(null, null, 2131746575, G);
                    }
                }
                int i21 = this.d.E;
                if (i21 == 10) {
                    uibVar.c(k96.M0(2131746558, null), G, false, false);
                } else if (i21 == 0 || i21 == 4 || i21 == 9 || i21 == 14) {
                    uibVar.c(k96.M0(2131754265, null), G, false, this.d.V != -1);
                } else {
                    uibVar.c(k96.M0(2131754266, null), G, false, this.d.V != -1);
                }
                if (this.d.E == 12) {
                    uibVar.setEnabled(!r0.x0());
                    return;
                }
                return;
            }
            if (i != privacyControlActivity.V) {
                if (i == privacyControlActivity.d0) {
                    i2 = ((d) privacyControlActivity).currentAccount;
                    uibVar.c(k96.M0(2131746608, null), qu2.r(i2).t(3) ? k96.M0(2131748587, null) : PrivacySettingsActivity.z0(this.d.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i == privacyControlActivity.g0) {
                        uibVar.b(k96.M0(privacyControlActivity.getUserConfig().p() ? 2131746622 : 2131746623, null), false);
                        zkb.X(uibVar.getTextView(), bkb.m6, this.d.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? k96.G(E(this.d.J), "Users", new Object[0]) : k96.M0(2131751149, null);
            PrivacyControlActivity privacyControlActivity4 = this.d;
            boolean[] zArr2 = privacyControlActivity4.G;
            byte b3 = privacyControlActivity4.K;
            if (zArr2[b3] && b3 == 0) {
                ArrayList arrayList3 = privacyControlActivity4.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? k96.a0(null, null, 2131746576, new Object[0]) : k96.a0(null, null, 2131746575, G2);
            }
            int i22 = this.d.E;
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                uibVar.c(k96.M0(2131748099, null), G2, false, false);
            } else {
                uibVar.c(k96.M0(2131748100, null), G2, false, false);
            }
            if (this.d.E == 12) {
                uibVar.setEnabled(!r0.x0());
                return;
            }
            return;
        }
        if (i15 == 1) {
            mhb mhbVar = (mhb) s49Var.a;
            PrivacyControlActivity privacyControlActivity5 = this.d;
            if (i == privacyControlActivity5.S) {
                mhbVar.setText(k96.M0(2131746559, null));
            } else {
                if (i == privacyControlActivity5.R) {
                    int i23 = privacyControlActivity5.E;
                    if (i23 == 10) {
                        String M0 = k96.M0(2131746617, null);
                        final byte b4 = r14 ? (byte) 1 : (byte) 0;
                        mhbVar.setText(gl.N2(M0, -1, 0, new Runnable(this) { // from class: wj8
                            public final /* synthetic */ yj8 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                yj8 yj8Var = this.b;
                                switch (b5) {
                                    case 0:
                                        yj8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity6 = yj8Var.d;
                                        privacyControlActivity6.showDialog((fx0) ij.l(privacyControlActivity6.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), null, new xj8(yj8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).a);
                                        break;
                                }
                            }
                        }, null));
                    } else if (i23 == 8) {
                        mhbVar.setText(k96.M0(2131746566, null));
                    }
                }
                i3 = privacyControlActivity5.setBirthdayRow;
                if (i == i3) {
                    mhbVar.setText(gl.D2(gl.N2(k96.M0(2131746666, null), -1, 0, new Runnable(this) { // from class: wj8
                        public final /* synthetic */ yj8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b;
                            yj8 yj8Var = this.b;
                            switch (b5) {
                                case 0:
                                    yj8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity6 = yj8Var.d;
                                    privacyControlActivity6.showDialog((fx0) ij.l(privacyControlActivity6.getParentActivity(), k96.M0(2131751226, null), k96.M0(2131751231, null), null, new xj8(yj8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).a);
                                    break;
                            }
                        }
                    }, null), true));
                } else {
                    PrivacyControlActivity privacyControlActivity6 = this.d;
                    if (i == privacyControlActivity6.R) {
                        int i24 = privacyControlActivity6.E;
                        if (i24 == 6) {
                            if (privacyControlActivity6.K == 1 && privacyControlActivity6.L == 1) {
                                mhbVar.setText(k96.M0(2131746596, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String concat = "https://t.me/+".concat(this.d.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(concat);
                                spannableString.setSpan(new q1(this, concat, (byte) 7), 0, concat.length(), 33);
                                spannableStringBuilder.append((CharSequence) k96.M0(2131746598, null)).append((CharSequence) "\n\n").append((CharSequence) k96.M0(2131746595, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                mhbVar.setText(spannableStringBuilder);
                            }
                        } else if (i24 == 5) {
                            mhbVar.setText(k96.M0(2131746643, null));
                        } else if (i24 == 4) {
                            mhbVar.setText(k96.M0(2131746585, null));
                        } else if (i24 == 9) {
                            mhbVar.setText(k96.M0(2131746674, null));
                        } else if (i24 == 14) {
                            mhbVar.setText(k96.M0(2131746611, null));
                        } else if (i24 == 11) {
                            mhbVar.setText(k96.M0(2131746668, null));
                        } else if (i24 == 12) {
                            mhbVar.setText(k96.M0(2131746637, null));
                        } else if (i24 == 3) {
                            mhbVar.setText(k96.M0(2131746657, null));
                        } else if (i24 == 2) {
                            mhbVar.setText(k96.M0(2131742616, null));
                        } else if (i24 == 1) {
                            mhbVar.setText(k96.M0(2131742618, null));
                        } else {
                            mhbVar.setText(k96.M0(2131751673, null));
                        }
                    } else if (i == privacyControlActivity6.W) {
                        int i25 = privacyControlActivity6.E;
                        if (i25 == 6) {
                            mhbVar.setText(k96.M0(2131746597, null));
                        } else if (i25 == 5) {
                            mhbVar.setText(k96.M0(2131746642, null));
                        } else if (i25 == 4) {
                            byte b5 = privacyControlActivity6.K;
                            if (b5 == 2) {
                                mhbVar.setText(gl.S2(k96.M0(2131746582, null)));
                            } else if (b5 == 0) {
                                mhbVar.setText(gl.S2(k96.M0(2131746584, null)));
                            } else {
                                mhbVar.setText(k96.M0(2131746583, null));
                            }
                        } else if (i25 == 3) {
                            mhbVar.setText(k96.M0(2131751671, null));
                        } else if (i25 == 9) {
                            mhbVar.setText(k96.M0(2131746675, null));
                        } else if (i25 == 14) {
                            mhbVar.setText(k96.M0(2131746612, null));
                        } else if (i25 == 11) {
                            mhbVar.setText(k96.M0(2131746667, null));
                        } else if (i25 == 2) {
                            mhbVar.setText(k96.M0(2131751674, null));
                        } else if (i25 == 1) {
                            mhbVar.setText(k96.M0(2131751669, null));
                        } else if (i25 == 12) {
                            mhbVar.setText(k96.M0(2131751670, null));
                        } else if (i25 == 8) {
                            mhbVar.setText(k96.M0(2131746565, null));
                        } else if (i25 == 10) {
                            mhbVar.setText(k96.M0(2131746556, null));
                        } else {
                            mhbVar.setText(k96.M0(2131751668, null));
                        }
                    } else if (i == privacyControlActivity6.b0) {
                        mhbVar.setText(k96.M0(2131747073, null));
                    } else if (i == privacyControlActivity6.f0) {
                        mhbVar.setText(k96.M0(2131749120, null));
                    } else if (i == privacyControlActivity6.h0) {
                        mhbVar.setText(k96.M0(privacyControlActivity6.getUserConfig().p() ? 2131746620 : 2131746621, null));
                    } else if (i == privacyControlActivity6.l0) {
                        float f = privacyControlActivity6.getMessagesController().k4.I1.f() / 1000.0f;
                        PrivacyControlActivity privacyControlActivity7 = this.d;
                        mhbVar.setText(k96.a0(null, null, 2131746554, bc.I0(this.d.getMessagesController().k4.I1.f()), String.valueOf(((int) (((privacyControlActivity7.N * f) / 1000.0d) * privacyControlActivity7.getMessagesController().k4.s3.i)) / 100.0d)));
                    } else if (i == privacyControlActivity6.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        cm2 cm2Var = new cm2(R.drawable.msg_input_gift, 0);
                        cm2Var.I = 0.583f;
                        cm2Var.J = 0.583f;
                        spannableString2.setSpan(cm2Var, 0, 1, 33);
                        mhbVar.setText(k96.V(null, null, 2131746635, spannableString2));
                    } else if (i == privacyControlActivity6.s0) {
                        mhbVar.setText(k96.M0(2131746631, null));
                    }
                }
            }
            zkb.h(bkb.Z6, null, mhbVar);
            return;
        }
        if (i15 == 2) {
            ld5 ld5Var = (ld5) s49Var.a;
            PrivacyControlActivity privacyControlActivity8 = this.d;
            if (i != privacyControlActivity8.P) {
                if (i == privacyControlActivity8.T) {
                    if (privacyControlActivity8.E == 10) {
                        ld5Var.setText(k96.M0(2131746557, null));
                        return;
                    } else {
                        ld5Var.setText(k96.M0(2131754428, null));
                        return;
                    }
                }
                if (i == privacyControlActivity8.c0) {
                    ld5Var.setText(k96.M0(2131746607, null));
                    return;
                }
                if (i == privacyControlActivity8.X) {
                    ld5Var.setText(k96.M0(2131746593, null));
                    return;
                }
                if (i == privacyControlActivity8.j0) {
                    ld5Var.setText(k96.M0(2131746555, null));
                    return;
                }
                i4 = privacyControlActivity8.giftTypesHeaderRow;
                if (i == i4) {
                    ld5Var.setText(k96.M0(2131746632, null));
                    return;
                }
                return;
            }
            int i26 = privacyControlActivity8.E;
            if (i26 == 6) {
                ld5Var.setText(k96.M0(2131746594, null));
                return;
            }
            if (i26 == 5) {
                ld5Var.setText(k96.M0(2131746639, null));
                return;
            }
            if (i26 == 4) {
                ld5Var.setText(k96.M0(2131746581, null));
                return;
            }
            if (i26 == 9) {
                ld5Var.setText(k96.M0(2131746673, null));
                return;
            }
            if (i26 == 14) {
                ld5Var.setText(k96.M0(2131746610, null));
                return;
            }
            if (i26 == 3) {
                ld5Var.setText(k96.M0(2131747561, null));
                return;
            }
            if (i26 == 2) {
                ld5Var.setText(k96.M0(2131742617, null));
                return;
            }
            if (i26 == 1) {
                ld5Var.setText(k96.M0(2131742619, null));
                return;
            }
            if (i26 == 8) {
                ld5Var.setText(k96.M0(2131746563, null));
                return;
            }
            if (i26 == 10) {
                ld5Var.setText(k96.M0(2131746616, null));
                return;
            }
            if (i26 == 11) {
                ld5Var.setText(k96.M0(2131746663, null));
                return;
            } else if (i26 == 12) {
                ld5Var.setText(k96.M0(2131746634, null));
                return;
            } else {
                ld5Var.setText(k96.M0(2131748820, null));
                return;
            }
        }
        if (i15 != 3) {
            if (i15 != 8) {
                if (i15 == 9) {
                    ija ijaVar = (ija) s49Var.a;
                    i14 = this.d.priceRow;
                    if (i == i14) {
                        int[] a = ija.a(new int[]{1, 10, 50, 100, kk7.d3, kk7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) this.d.getMessagesController().k4.H1.f());
                        k88 k88Var = new k88(this, (byte) 8);
                        hja hjaVar = new hja();
                        hjaVar.c = a;
                        hjaVar.d = (byte) 20;
                        hjaVar.e = k88Var;
                        PrivacyControlActivity privacyControlActivity9 = this.d;
                        ijaVar.d((int) Utilities.k(privacyControlActivity9.N, privacyControlActivity9.getMessagesController().k4.H1.f(), 1L), hjaVar, new xj8(this, r14 ? (byte) 1 : (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            }
            ahb ahbVar = (ahb) s49Var.a;
            ahbVar.setCheckBoxIcon(0);
            i12 = this.d.readRow;
            if (i == i12) {
                ahbVar.f(k96.M0(2131749121, null), this.d.D0, false);
                return;
            }
            i13 = this.d.showGiftIconRow;
            if (i == i13) {
                ahbVar.f(k96.M0(2131746636, null), this.d.F0, false);
                return;
            }
            PrivacyControlActivity privacyControlActivity10 = this.d;
            if (i == privacyControlActivity10.n0) {
                ahbVar.f(k96.M0(2131746627, null), this.d.H0, true);
                if (!this.d.getUserConfig().p() && this.d.H0) {
                    i16 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i16);
                return;
            }
            if (i == privacyControlActivity10.o0) {
                ahbVar.f(k96.M0(2131746630, null), this.d.J0, true);
                if (!this.d.getUserConfig().p() && this.d.J0) {
                    i17 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i17);
                return;
            }
            if (i == privacyControlActivity10.p0) {
                ahbVar.f(k96.M0(2131746628, null), this.d.L0, true);
                if (!this.d.getUserConfig().p() && this.d.L0) {
                    i18 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i18);
                return;
            }
            if (i == privacyControlActivity10.q0) {
                ahbVar.f(k96.M0(2131746633, null), this.d.N0, true);
                if (!this.d.getUserConfig().p() && this.d.N0) {
                    i19 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i19);
                return;
            }
            if (i == privacyControlActivity10.r0) {
                ahbVar.f(k96.M0(2131746629, null), this.d.P0, false);
                if (!this.d.getUserConfig().p() && this.d.P0) {
                    i20 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i20);
                return;
            }
            return;
        }
        vy8 vy8Var = (vy8) s49Var.a;
        vy8Var.setRadioIcon(null);
        i5 = this.d.everybodyRow;
        if (i != i5) {
            PrivacyControlActivity privacyControlActivity11 = this.d;
            if (i != privacyControlActivity11.Q) {
                i11 = privacyControlActivity11.nobodyRow;
                if (i != i11) {
                    PrivacyControlActivity privacyControlActivity12 = this.d;
                    if (i != privacyControlActivity12.i0) {
                        if (i == privacyControlActivity12.Z) {
                            vy8Var.c(k96.M0(2131748837, null), this.d.L == 1, false);
                        } else if (i == privacyControlActivity12.Y) {
                            vy8Var.c(k96.M0(2131748827, null), this.d.L == 0, true);
                        }
                        if (this.d.E != 12) {
                            vy8Var.b(null, !r0.x0());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i6 = this.d.everybodyRow;
        PrivacyControlActivity privacyControlActivity13 = this.d;
        if (i == i6) {
            if (privacyControlActivity13.E == 3) {
                vy8Var.c(k96.M0(2131747560, null), this.d.K == 0, true);
            } else {
                vy8Var.c(k96.M0(2131748827, null), this.d.K == 0, true);
            }
        } else if (i == privacyControlActivity13.Q) {
            if (privacyControlActivity13.E != 8 || privacyControlActivity13.getUserConfig().p()) {
                PrivacyControlActivity privacyControlActivity14 = this.d;
                if (privacyControlActivity14.E == 10) {
                    if (!privacyControlActivity14.getMessagesController().k4.n2.f) {
                    }
                }
                i7 = this.d.E;
                if (i7 != 3) {
                    String M02 = k96.M0(2131747565, null);
                    PrivacyControlActivity privacyControlActivity15 = this.d;
                    boolean z = privacyControlActivity15.K == 2;
                    i10 = privacyControlActivity15.nobodyRow;
                    vy8Var.c(M02, z, (i10 == -1 && this.d.i0 == -1) ? false : true);
                } else if (i7 == 10) {
                    String M03 = k96.M0(2131746618, null);
                    PrivacyControlActivity privacyControlActivity16 = this.d;
                    boolean z2 = privacyControlActivity16.K == 2;
                    i9 = privacyControlActivity16.nobodyRow;
                    vy8Var.c(M03, z2, (i9 == -1 && this.d.i0 == -1) ? false : true);
                } else {
                    String M04 = k96.M0(2131748837, null);
                    PrivacyControlActivity privacyControlActivity17 = this.d;
                    boolean z3 = privacyControlActivity17.K == 2;
                    i8 = privacyControlActivity17.nobodyRow;
                    vy8Var.c(M04, z3, (i8 == -1 && this.d.i0 == -1) ? false : true);
                }
            }
            vy8Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            i7 = this.d.E;
            if (i7 != 3) {
            }
        } else {
            int i27 = privacyControlActivity13.i0;
            int i28 = privacyControlActivity13.E;
            if (i == i27) {
                if (i28 == 10 && !privacyControlActivity13.getUserConfig().p()) {
                    vy8Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                }
                vy8Var.c(k96.M0(2131746560, null), this.d.K == 3, false);
            } else {
                if (i28 != 8 || privacyControlActivity13.getUserConfig().p()) {
                    PrivacyControlActivity privacyControlActivity18 = this.d;
                    if (privacyControlActivity18.E == 10) {
                        if (!privacyControlActivity18.getMessagesController().k4.n2.f) {
                        }
                    }
                    if (this.d.E != 3) {
                        vy8Var.c(k96.M0(2131747558, null), this.d.K == 1, false);
                    } else {
                        vy8Var.c(k96.M0(2131748824, null), this.d.K == 1, false);
                    }
                }
                vy8Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                if (this.d.E != 3) {
                }
            }
        }
        if (this.d.E != 12) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i) {
            case 0:
                uib uibVar = new uib(context);
                uibVar.setCanDisable(true);
                view = uibVar;
                break;
            case 1:
                view = new mhb(context);
                break;
            case 2:
                view = new ld5(context);
                break;
            case 3:
                view = new vy8(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new b9a(context, (de9) null);
                break;
            case 6:
                wgb wgbVar = new wgb(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = wgbVar;
                if (privacyControlActivity.z0 == null) {
                    wgbVar.o(R.drawable.msg_addphoto, k96.a0(null, null, 2131745325, new Object[0]), false);
                } else {
                    wgbVar.o(R.drawable.msg_addphoto, k96.a0("UpdatePhotoForRest", null, 2131743578, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(bkb.L0(false));
                privacyControlActivity.w0.g(bkb.u6, bkb.t6);
                privacyControlActivity.v0 = new oy8(R.raw.camera_outline, gl.L(50.0f), gl.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-gl.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                view = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new be0(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new gt2(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    be0 be0Var = privacyControlActivity.x0;
                    if (photo != null) {
                        gl5 i4 = gl5.i(photoSize, photo);
                        i3 = ((d) privacyControlActivity).currentAccount;
                        be0Var.m(i4, "50_50", null, y6c.h(i3).f());
                    } else {
                        gl5 e = gl5.e(photoSize.location);
                        i2 = ((d) privacyControlActivity).currentAccount;
                        be0Var.m(e, "50_50", null, y6c.h(i2).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, nme.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(k96.M0(2131746096, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(bkb.L0(false));
                gt2 gt2Var = privacyControlActivity.y0;
                int i5 = bkb.o7;
                gt2Var.g(i5, i5);
                view = privacyControlActivity.y0;
                break;
            case 8:
                wjbVar = ((d) privacyControlActivity).resourceProvider;
                view = new ahb(context, wjbVar);
                break;
            case 9:
                wjbVar2 = ((d) privacyControlActivity).resourceProvider;
                view = new ija(context, wjbVar2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                wjbVar3 = ((d) privacyControlActivity).resourceProvider;
                u41 u41Var = new u41(wjbVar3, context, true);
                u41Var.setRoundRadius(24);
                cm2 cm2Var = new cm2(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131746561, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                u41Var.i(spannableStringBuilder, false, true);
                u41Var.setOnClickListener(new fr7(this, (byte) 28));
                frameLayout.addView(u41Var, nme.d(-1, 48.0f, kk7.D1, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new y29(view);
    }
}
