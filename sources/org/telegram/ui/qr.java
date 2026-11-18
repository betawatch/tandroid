package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qr extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30 {
    public org.telegram.ui.Cells.n8 E;
    public or F;
    public org.telegram.ui.Cells.n8 G;
    public org.telegram.messenger.uo H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public pr P;
    public final org.telegram.ui.Components.u30 Q;
    public TLRPC.FileLocation R;
    public int S;
    public int T;
    public TLRPC.Photo U;
    public org.telegram.ui.Components.q9 V;
    public FrameLayout W;
    public org.telegram.ui.Components.e51 X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.d5 a;
    public org.telegram.messenger.fj a0;
    public org.telegram.ui.Cells.l3 b;
    public org.telegram.ui.Cells.l3 c;
    public org.telegram.ui.Cells.l3 d;
    public org.telegram.ui.Components.q9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.b9 n;
    public final org.telegram.ui.ActionBar.i6 r;
    public RadialProgressView s;
    public hi.m5 w;
    public AnimatorSet x;
    public org.telegram.ui.Cells.n8 y;

    public qr(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new org.telegram.ui.Components.u30(0, true, true);
    }

    public static /* synthetic */ void Z(qr qrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = qrVar.getMessagesController().q1(qrVar.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(qrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(qrVar, 5));
    }

    public static void a0(qr qrVar, TLRPC.User user) {
        qrVar.R = null;
        qrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
        c22.photo.personal = false;
        TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(qrVar.currentAccount).d2(qrVar.I);
        if (d2 != null) {
            d2.personal_photo = null;
            d2.flags &= -2097153;
            qrVar.getMessagesStorage().j2(d2, true);
        }
        TLRPC.Photo photo = qrVar.U;
        if (photo != null) {
            c22.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null) {
                c22.photo.photo_small = w10.location;
            }
            if (w11 != null) {
                c22.photo.photo_big = w11.location;
            }
        } else {
            c22.photo = null;
            c22.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        qrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        qrVar.k0();
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.c0, new Object[0]);
        qrVar.getNotificationCenter().k(org.telegram.messenger.ks.r, 2);
    }

    public static void b0(qr qrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.u30 u30Var = qrVar.Q;
        if (u30Var.U) {
            return;
        }
        int i7 = qrVar.T;
        if (i7 == 2) {
            qrVar.R = photoSize.location;
        } else if (i7 == 1 && qrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.s4 parentLayout = qrVar.getParentLayout();
            org.telegram.ui.ActionBar.h2 lastFragment = qrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(size);
                if (h2Var instanceof bn) {
                    bn bnVar = (bn) h2Var;
                    org.telegram.ui.ActionBar.h2 h2Var2 = lastFragment;
                    if (bnVar.a() == qrVar.I && bnVar.g4 == 0) {
                        bnVar.Ab(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                            if (arrayList.get(size2) != h2Var3) {
                                ((org.telegram.ui.ActionBar.h2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            h2Var2 = h2Var3;
                        }
                        h2Var2.finishFragment();
                    } else {
                        lastFragment = h2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.h2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            qrVar.e.j(org.telegram.messenger.fc.e(qrVar.R), "50_50", qrVar.n, qrVar.getMessagesController().c2(Long.valueOf(qrVar.I)));
            if (qrVar.T == 2) {
                qrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.zy.C(qrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.zy.E();
                tL_messageService.dialog_id = qrVar.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = qrVar.getUserConfig().j();
                tL_messageService.id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = qrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = qrVar.I;
                tL_messageService.date = qrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(qrVar.currentAccount, tL_messageService, false, false);
                qrVar.a0 = fjVar;
                arrayList2.add(fjVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.mp.u1(qrVar.currentAccount).x5(0, qrVar.I, arrayList2);
                qrVar.getMessagesController().E7.put(tL_messageService.local_id, u30Var);
            }
        } else {
            TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
            if (qrVar.a0 == null && c22 != null) {
                boolean z11 = inputFile2 != null;
                c22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                c22.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(c22);
                qrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                qrVar.getNotificationCenter().k(org.telegram.messenger.ks.c0, new Object[0]);
                org.telegram.messenger.ks notificationCenter = qrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.mp.I8;
                notificationCenter.k(org.telegram.messenger.ks.r, 2);
            }
            qrVar.h0(qrVar.R, photoSize2.location, inputFile, inputFile2, videoSize, d, qrVar.T);
            qrVar.i0(false, true);
        }
        qrVar.k0();
    }

    public static void c0(qr qrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (qrVar.a0 != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
        TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(qrVar.currentAccount).d2(qrVar.I);
        if (d2 != null) {
            d2.personal_photo = tL_photos_photo.photo;
            d2.flags |= TLObject.FLAG_21;
            qrVar.getMessagesStorage().j2(d2, true);
        }
        if (c22 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null && fileLocation != null) {
                org.telegram.messenger.w7.G(qrVar.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(qrVar.currentAccount);
                org.telegram.messenger.w7.J(fileLocation, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.fc.l(qrVar.currentAccount, 1, c22));
            }
            if (w11 != null && fileLocation2 != null) {
                org.telegram.messenger.w7.G(qrVar.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(qrVar.currentAccount);
                org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
            }
            bg.n0.a(tL_photos_photo.photo, c22, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            qrVar.getMessagesStorage().m1(arrayList2, null, false, true);
            qrVar.getMessagesController().W0(qrVar.I);
            qrVar.getNotificationCenter().k(org.telegram.messenger.ks.c0, new Object[0]);
            qrVar.getNotificationCenter().k(org.telegram.messenger.ks.r, 2);
            if (qrVar.getParentActivity() != null) {
                if (i7 == 2) {
                    org.telegram.ui.Components.lc.b0(qrVar).V(arrayList2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("UserCustomPhotoSeted", null, 2131743506, c22.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.lc.b0(qrVar).V(arrayList2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("UserCustomPhotoSeted", null, 2131743506, c22.first_name)), null, null).j();
                }
            }
        }
        qrVar.R = null;
        qrVar.k0();
    }

    public static /* synthetic */ void d0(qr qrVar) {
        if (qrVar.a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(qrVar.a0.e1()));
            org.telegram.messenger.ks.f(qrVar.currentAccount).k(org.telegram.messenger.ks.w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.t30
    public final void Q(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void U() {
        org.telegram.messenger.g0.g3(new gr(this, 0));
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.hr
            @Override // java.lang.Runnable
            public final void run() {
                qr.b0(qr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.J) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748091, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131751271, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mr(this));
        this.a = this.simpleActionBar.s(org.telegram.messenger.gd.M0(this.J ? 2131751742 : 2131745751, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.i6 i6Var = this.r;
        org.telegram.ui.ActionBar.u6.h(i10, frameLayout2, i6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.e = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        this.W.addView(this.e, c8.ma.d(64, 64.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        int i11 = 10;
        hi.m5 m5Var = new hi.m5(this, context, paint, i11);
        this.w = m5Var;
        this.W.addView(m5Var, c8.ma.d(64, 64.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.s.setProgressColor(-1);
        final int i12 = 0;
        this.s.setNoProgress(false);
        this.W.addView(this.s, c8.ma.d(64, 64.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        this.f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = this.W;
        TextView textView3 = this.f;
        boolean z10 = org.telegram.messenger.gd.a0;
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout3, textView3, c8.ma.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = m10;
        org.telegram.ui.ActionBar.u6.U(m10, org.telegram.ui.ActionBar.n6.A6, i6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.W;
        TextView textView4 = this.h;
        boolean z11 = org.telegram.messenger.gd.a0;
        frameLayout4.addView(textView4, c8.ma.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.M0(2131750678, null), false, false, -1, this.r);
        this.b = l3Var;
        l3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.u6.h(i10, this.b, i6Var);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kr
            public final /* synthetic */ qr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        qr qrVar = this.b;
                        qrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.j3 j3Var = qrVar.c.d;
                        j3Var.setSelection(j3Var.length());
                        return true;
                    case 1:
                        qr qrVar2 = this.b;
                        if (i13 == 6) {
                            qrVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        qrVar2.d.d.requestFocus();
                        qrVar2.d.d.setSelection(qrVar2.c.d.length());
                        return true;
                    default:
                        qr qrVar3 = this.b;
                        if (i13 == 6) {
                            qrVar3.a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        this.b.d.setOnFocusChangeListener(new nr());
        this.b.setText(this.N);
        org.telegram.ui.Cells.l3 l3Var2 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.M0(2131748840, null), false, false, -1, this.r);
        this.c = l3Var2;
        l3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.u6.h(i10, this.c, i6Var);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kr
            public final /* synthetic */ qr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i13, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        qr qrVar = this.b;
                        qrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.j3 j3Var = qrVar.c.d;
                        j3Var.setSelection(j3Var.length());
                        return true;
                    case 1:
                        qr qrVar2 = this.b;
                        if (i13 == 6) {
                            qrVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        qrVar2.d.d.requestFocus();
                        qrVar2.d.d.setSelection(qrVar2.c.d.length());
                        return true;
                    default:
                        qr qrVar3 = this.b;
                        if (i13 == 6) {
                            qrVar3.a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        this.c.setText(this.O);
        org.telegram.ui.Cells.l3 l3Var3 = new org.telegram.ui.Cells.l3(context, org.telegram.messenger.gd.M0(2131754393, null), true, true, ((org.telegram.messenger.j0) getMessagesController().A7.D.b).c, this.r);
        this.d = l3Var3;
        org.telegram.ui.ActionBar.u6.G(l3Var3.d, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        int i13 = 6;
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.u6.h(i10, this.d, i6Var);
        final int i14 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.kr
            public final /* synthetic */ qr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i132, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i132 != 5) {
                            return false;
                        }
                        qr qrVar = this.b;
                        qrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.j3 j3Var = qrVar.c.d;
                        j3Var.setSelection(j3Var.length());
                        return true;
                    case 1:
                        qr qrVar2 = this.b;
                        if (i132 == 6) {
                            qrVar2.a.performClick();
                            return true;
                        }
                        if (i132 != 5) {
                            return false;
                        }
                        qrVar2.d.d.requestFocus();
                        qrVar2.d.d.setSelection(qrVar2.c.d.length());
                        return true;
                    default:
                        qr qrVar3 = this.b;
                        if (i132 == 6) {
                            qrVar3.a.performClick();
                            return true;
                        }
                        qrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, i6Var);
            this.y = n8Var;
            n8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.a0(null, null, 2131744163, c22.first_name), true);
            this.y.setBackground(org.telegram.ui.ActionBar.n6.M0(i6Var, true));
            org.telegram.ui.Cells.n8 n8Var2 = this.y;
            int i15 = org.telegram.ui.ActionBar.n6.v6;
            int i16 = org.telegram.ui.ActionBar.n6.u6;
            n8Var2.g(i15, i16);
            final org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(R.raw.photo_suggest_icon, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.y.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.y.e.setAnimation(mh0Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lr
                public final /* synthetic */ qr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final qr qrVar = this.b;
                            qrVar.S = 1;
                            org.telegram.ui.Components.u30 u30Var = qrVar.Q;
                            TLRPC.User user = c22;
                            u30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
                            final int i17 = 1;
                            final org.telegram.ui.Components.mh0 mh0Var2 = mh0Var;
                            u30Var.n(z12, j2Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.jr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            qr qrVar2 = qrVar;
                                            boolean g10 = qrVar2.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var3 = mh0Var2;
                                            if (!g10) {
                                                mh0Var3.P(86);
                                                qrVar2.E.e.d();
                                                break;
                                            } else {
                                                mh0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            qr qrVar3 = qrVar;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var4 = mh0Var2;
                                            if (!g11) {
                                                mh0Var4.P(85);
                                                qrVar3.y.e.d();
                                                break;
                                            } else {
                                                mh0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            mh0Var2.M(0);
                            mh0Var2.P(43);
                            qrVar.y.e.d();
                            break;
                        default:
                            final qr qrVar2 = this.b;
                            qrVar2.S = 2;
                            org.telegram.ui.Components.u30 u30Var2 = qrVar2.Q;
                            TLRPC.User user2 = c22;
                            u30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(0);
                            final int i18 = 0;
                            final org.telegram.ui.Components.mh0 mh0Var3 = mh0Var;
                            u30Var2.n(z13, j2Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.jr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            qr qrVar22 = qrVar2;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var32 = mh0Var3;
                                            if (!g10) {
                                                mh0Var32.P(86);
                                                qrVar22.E.e.d();
                                                break;
                                            } else {
                                                mh0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            qr qrVar3 = qrVar2;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var4 = mh0Var3;
                                            if (!g11) {
                                                mh0Var4.P(85);
                                                qrVar3.y.e.d();
                                                break;
                                            } else {
                                                mh0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            mh0Var3.M(0);
                            mh0Var3.P(43);
                            qrVar2.E.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(context, i6Var);
            this.E = n8Var3;
            n8Var3.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.a0(null, null, 2131743442, c22.first_name), false);
            this.E.setBackground(org.telegram.ui.ActionBar.n6.M0(i6Var, true));
            this.E.g(i15, i16);
            final org.telegram.ui.Components.mh0 mh0Var2 = new org.telegram.ui.Components.mh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.E.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.E.e.setAnimation(mh0Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lr
                public final /* synthetic */ qr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            final qr qrVar = this.b;
                            qrVar.S = 1;
                            org.telegram.ui.Components.u30 u30Var = qrVar.Q;
                            TLRPC.User user = c22;
                            u30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
                            final int i17 = 1;
                            final org.telegram.ui.Components.mh0 mh0Var22 = mh0Var2;
                            u30Var.n(z12, j2Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.jr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            qr qrVar22 = qrVar;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var32 = mh0Var22;
                                            if (!g10) {
                                                mh0Var32.P(86);
                                                qrVar22.E.e.d();
                                                break;
                                            } else {
                                                mh0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            qr qrVar3 = qrVar;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var4 = mh0Var22;
                                            if (!g11) {
                                                mh0Var4.P(85);
                                                qrVar3.y.e.d();
                                                break;
                                            } else {
                                                mh0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            mh0Var22.M(0);
                            mh0Var22.P(43);
                            qrVar.y.e.d();
                            break;
                        default:
                            final qr qrVar2 = this.b;
                            qrVar2.S = 2;
                            org.telegram.ui.Components.u30 u30Var2 = qrVar2.Q;
                            TLRPC.User user2 = c22;
                            u30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            org.telegram.messenger.j2 j2Var2 = new org.telegram.messenger.j2(0);
                            final int i18 = 0;
                            final org.telegram.ui.Components.mh0 mh0Var3 = mh0Var2;
                            u30Var2.n(z13, j2Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.jr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            qr qrVar22 = qrVar2;
                                            boolean g10 = qrVar22.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var32 = mh0Var3;
                                            if (!g10) {
                                                mh0Var32.P(86);
                                                qrVar22.E.e.d();
                                                break;
                                            } else {
                                                mh0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            qr qrVar3 = qrVar2;
                                            boolean g11 = qrVar3.Q.g();
                                            org.telegram.ui.Components.mh0 mh0Var4 = mh0Var3;
                                            if (!g11) {
                                                mh0Var4.P(85);
                                                qrVar3.y.e.d();
                                                break;
                                            } else {
                                                mh0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            mh0Var3.M(0);
                            mh0Var3.P(43);
                            qrVar2.E.e.d();
                            break;
                    }
                }
            });
            this.V = new org.telegram.ui.Components.q9(context);
            this.F = new or(this, context, i6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.b9(0, c22);
            }
            this.V.f(c22.photo, this.n);
            this.F.addView(this.V, c8.ma.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(org.telegram.messenger.gd.M0(2131745893, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(org.telegram.ui.ActionBar.n6.M0(i6Var, true));
            this.F.g(i15, i16);
            this.F.setOnClickListener(new y(this, context, c22, i11));
            org.telegram.ui.Cells.n8 n8Var4 = new org.telegram.ui.Cells.n8(context, i6Var);
            this.G = n8Var4;
            n8Var4.o(R.drawable.menu_birthday, org.telegram.messenger.gd.a0(null, null, 2131743441, new Object[0]), false);
            this.G.setBackground(org.telegram.ui.ActionBar.n6.M0(i6Var, true));
            this.G.g(i15, i16);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.G.setOnClickListener(new org.telegram.ui.Components.c31(9, this, c22));
            TLRPC.UserFull d2 = getMessagesController().d2(this.I);
            if (d2 != null) {
                TLRPC.Photo photo = d2.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = d2.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(this, new a5(this, 7), new w0(this, 29), null);
        this.X = e51Var;
        e51Var.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bi.d6(i13, this, frameLayout));
        frameLayout.addView(this.X, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.uo uoVar;
        if (i7 == org.telegram.messenger.ks.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            j0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.g3 && (uoVar = (org.telegram.messenger.uo) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(uoVar.b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final boolean e() {
        return this.T != 1;
    }

    public final String g0() {
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
        return (c22 == null || TextUtils.isEmpty(c22.phone)) ? this.M : c22.phone;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i7) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().q1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i7 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new bg.l0(this, fileLocation, inputFile2, fileLocation2, i7, 9));
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z11) {
            if (z10) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        if (z10) {
            this.s.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<hi.m5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<hi.m5, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new on(28, this, z10));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User c22;
        if (this.f == null || (c22 = getMessagesController().c2(Long.valueOf(this.I))) == null) {
            return;
        }
        if (TextUtils.isEmpty(g0())) {
            this.f.setText(org.telegram.messenger.gd.M0(2131748218, null));
        } else {
            this.f.setText(pf.b.c().b("+" + g0()));
        }
        this.h.setText(org.telegram.messenger.gd.d0(this.currentAccount, c22, null, null));
        if (this.R == null) {
            org.telegram.ui.Components.q9 q9Var = this.e;
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(0, c22);
            this.n = b9Var;
            q9Var.f(c22, b9Var);
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.j(org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.b9(0, c22);
        }
        TLRPC.FileLocation fileLocation = this.R;
        if (fileLocation == null) {
            this.e.f(c22, this.n);
        } else {
            this.e.j(org.telegram.messenger.fc.e(fileLocation), "50_50", this.n, getMessagesController().c2(Long.valueOf(this.I)));
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.g3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        this.L = org.telegram.messenger.mp.u1(this.currentAccount).g7.getBoolean("dialog_bar_exception" + this.I, false);
        TLRPC.User c22 = this.I != 0 ? getMessagesController().c2(Long.valueOf(this.I)) : null;
        org.telegram.ui.Components.u30 u30Var = this.Q;
        if (u30Var != null) {
            u30Var.a = this;
            u30Var.b = this;
        }
        this.H = org.telegram.messenger.mp.u1(this.currentAccount).W0(this.I);
        return c22 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.g3);
        org.telegram.ui.Components.u30 u30Var = this.Q;
        if (u30Var != null) {
            u30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        TLRPC.User c22;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (c22 = getMessagesController().c2(Long.valueOf(this.I))) != null) {
                this.n.r(c22);
                this.e.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public qr(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = i6Var;
        this.Q = new org.telegram.ui.Components.u30(0, true, true);
    }
}
