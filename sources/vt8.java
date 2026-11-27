// default package

import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt8 implements ncc, occ {
    public final /* synthetic */ au8 a;

    public /* synthetic */ vt8(au8 au8Var) {
        this.a = au8Var;
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        au8 au8Var;
        TL_stars.SavedStarGift savedStarGift;
        sx4 sx4Var;
        final au8 au8Var2;
        final TL_stars.SavedStarGift savedStarGift2;
        sx4 sx4Var2;
        boolean z2;
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        String str3;
        String M0;
        int i5;
        sx4 sx4Var3;
        boolean z3;
        TL_stars.SavedStarGift savedStarGift3;
        au8 au8Var3 = this.a;
        int i6 = au8Var3.b;
        cga cgaVar = au8Var3.a;
        boolean z4 = false;
        int i7 = 0;
        if (au8Var3.e != null) {
            if (view instanceof sx4) {
                Object obj = b8cVar.H;
                if (obj instanceof TL_stars.SavedStarGift) {
                    sx4 sx4Var4 = (sx4) view;
                    TL_stars.SavedStarGift savedStarGift4 = (TL_stars.SavedStarGift) obj;
                    e eVar = cgaVar.a;
                    zwa zwaVar = cgaVar.e;
                    fu5 J = fu5.J(eVar, view);
                    cgaVar.J = J;
                    byte b = 5;
                    byte b2 = 2;
                    if (zwaVar.h()) {
                        if (!au8Var3.d) {
                            zwaVar.d().size();
                        }
                        fu5 K = J.K();
                        K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(J, b2), false);
                        K.j();
                        ti3 ti3Var = new ti3(au8Var3.getContext(), b);
                        LinearLayout linearLayout = new LinearLayout(au8Var3.getContext());
                        ti3Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z5 = true;
                        K.q(ti3Var, tre.o(-1, -2));
                        if (zwaVar.d().size() + 1 < uc7.s1(i6).l4.z.f()) {
                            b8 b8Var = new b8(0, au8Var3.c, au8Var3.getContext(), false, false);
                            b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                            int i8 = aob.E8;
                            b8Var.c(i8, aob.F8);
                            b8Var.h(0.12f, i8);
                            b8Var.j(ob6.M0(2131750057, null), R.drawable.menu_folder_add, null);
                            b8Var.setOnClickListener(new lw4(au8Var3, J, savedStarGift4, (byte) 17));
                            linearLayout.addView(b8Var, tre.o(-1, -2));
                        }
                        ArrayList d = zwaVar.d();
                        int size = d.size();
                        int i9 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i9 < size) {
                            int i10 = i9 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i9);
                            ArrayList arrayList = zwaVar.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            while (true) {
                                if (i7 >= size2) {
                                    sx4Var3 = sx4Var4;
                                    z3 = false;
                                    break;
                                }
                                Object obj2 = arrayList.get(i7);
                                i7++;
                                sx4Var3 = sx4Var4;
                                if (jxa.h((TL_stars.SavedStarGift) obj2, savedStarGift4)) {
                                    z3 = z5;
                                    break;
                                }
                                sx4Var4 = sx4Var3;
                            }
                            b8 b8Var2 = new b8(2, au8Var3.c, au8Var3.getContext(), false, false);
                            b8Var2.setChecked(z3);
                            au8 au8Var4 = au8Var3;
                            b8Var2.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                            int i11 = aob.E8;
                            b8Var2.c(i11, aob.F8);
                            b8Var2.h(0.12f, i11);
                            if (tL_starGiftCollection.icon != null) {
                                yt8 yt8Var = new yt8(3, i6, tL_starGiftCollection.icon);
                                ImageView imageView = b8Var2.getImageView();
                                savedStarGift3 = savedStarGift4;
                                imageView.addOnAttachStateChangeListener(new xc(yt8Var, z5 ? (byte) 1 : (byte) 0));
                                b8Var2.j(tL_starGiftCollection.title, 0, yt8Var);
                            } else {
                                savedStarGift3 = savedStarGift4;
                                b8Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            TL_stars.SavedStarGift savedStarGift5 = savedStarGift3;
                            boolean z6 = z3;
                            LinearLayout linearLayout3 = linearLayout2;
                            b8Var2.setOnClickListener(new e57(au8Var4, z6, tL_starGiftCollection, savedStarGift5, J, (byte) 1));
                            linearLayout3.addView(b8Var2, tre.o(-1, -2));
                            savedStarGift4 = savedStarGift5;
                            d = arrayList2;
                            size = size;
                            i9 = i10;
                            z5 = true;
                            i7 = 0;
                            au8Var3 = au8Var4;
                            linearLayout2 = linearLayout3;
                            sx4Var4 = sx4Var3;
                        }
                        au8Var = au8Var3;
                        savedStarGift = savedStarGift4;
                        sx4Var = sx4Var4;
                        J.b(R.drawable.msg_addfolder, ob6.M0(2131750356, null), new c10(J, K, (byte) 7), false);
                        J.j();
                    } else {
                        au8Var = au8Var3;
                        savedStarGift = savedStarGift4;
                        sx4Var = sx4Var4;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!cgaVar.c() || au8Var.d || (savedStarGift.unsaved && savedStarGift.pinned_to_top)) {
                            au8Var2 = au8Var;
                            savedStarGift2 = savedStarGift;
                            sx4Var2 = sx4Var;
                            z2 = true;
                            z2 = true;
                            z2 = true;
                            str = null;
                            if (cgaVar.c() && au8Var2.d) {
                                J.b(R.drawable.tabs_reorder, ob6.M0(2131749991, null), new qt8(au8Var2, z2 ? (byte) 1 : (byte) 0), false);
                            }
                        } else {
                            if (savedStarGift.pinned_to_top) {
                                str3 = null;
                                M0 = ob6.M0(2131749830, null);
                                i5 = R.drawable.msg_unpin;
                            } else {
                                str3 = null;
                                M0 = ob6.M0(2131750036, null);
                                i5 = R.drawable.msg_pin;
                            }
                            int i12 = i5;
                            TL_stars.SavedStarGift savedStarGift6 = savedStarGift;
                            str = str3;
                            savedStarGift2 = savedStarGift6;
                            au8Var2 = au8Var;
                            sx4Var2 = sx4Var;
                            z2 = true;
                            J.b(i12, M0, new vp8((Object) au8Var2, (Object) savedStarGift2, (Object) sx4Var2, (Object) view, (byte) 4), false);
                            J.k(R.drawable.tabs_reorder, ob6.M0(2131749991, str), new qt8(au8Var2, (byte) 0), savedStarGift2.pinned_to_top);
                        }
                        TL_stars.StarGift starGift = savedStarGift2.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = uc7.s1(i6).N2 + "/nft/" + savedStarGift2.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (wua.H1(i6, wf3.n(tL_starGiftUnique.owner_id))) {
                            if (wua.J1(i6, tL_starGiftUnique)) {
                                i3 = R.drawable.menu_takeoff;
                                i4 = 2131749825;
                            } else {
                                i3 = R.drawable.menu_wear;
                                i4 = 2131749788;
                            }
                            final byte b3 = 0;
                            J.b(i3, ob6.M0(i4, str), new Runnable() { // from class: rt8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b4 = b3;
                                    TL_stars.SavedStarGift savedStarGift7 = savedStarGift2;
                                    switch (b4) {
                                        case 0:
                                            au8 au8Var5 = au8Var2;
                                            zt8 zt8Var = new zt8(au8Var5, au8Var5.getContext(), au8Var5.b, au8Var5.a.c, au8Var5.c, (byte) 0);
                                            zt8Var.o2(savedStarGift7, null);
                                            zt8Var.B2(false);
                                            break;
                                        case 1:
                                            au8 au8Var6 = au8Var2;
                                            zt8 zt8Var2 = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 1);
                                            zt8Var2.o2(savedStarGift7, null);
                                            zt8Var2.O1();
                                            break;
                                        default:
                                            au8 au8Var7 = au8Var2;
                                            zt8 zt8Var3 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 2);
                                            zt8Var3.o2(savedStarGift7, null);
                                            zt8Var3.b2();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        J.k(R.drawable.msg_link2, ob6.M0(2131751727, str), new ep8(au8Var2, str2, (byte) 17), str2 != null ? z2 ? 1 : 0 : false);
                        boolean z7 = str2 != null ? z2 ? 1 : 0 : false;
                        String M02 = ob6.M0(2131745187, str);
                        final byte b4 = z2 ? (byte) 1 : (byte) 0;
                        J.k(R.drawable.msg_share, M02, new Runnable() { // from class: rt8
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b4;
                                TL_stars.SavedStarGift savedStarGift7 = savedStarGift2;
                                switch (b42) {
                                    case 0:
                                        au8 au8Var5 = au8Var2;
                                        zt8 zt8Var = new zt8(au8Var5, au8Var5.getContext(), au8Var5.b, au8Var5.a.c, au8Var5.c, (byte) 0);
                                        zt8Var.o2(savedStarGift7, null);
                                        zt8Var.B2(false);
                                        break;
                                    case 1:
                                        au8 au8Var6 = au8Var2;
                                        zt8 zt8Var2 = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 1);
                                        zt8Var2.o2(savedStarGift7, null);
                                        zt8Var2.O1();
                                        break;
                                    default:
                                        au8 au8Var7 = au8Var2;
                                        zt8 zt8Var3 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 2);
                                        zt8Var3.o2(savedStarGift7, null);
                                        zt8Var3.b2();
                                        break;
                                }
                            }
                        }, z7);
                    } else {
                        au8Var2 = au8Var;
                        savedStarGift2 = savedStarGift;
                        sx4Var2 = sx4Var;
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        str = null;
                        if (cgaVar.c() && au8Var2.d) {
                            J.b(R.drawable.tabs_reorder, ob6.M0(2131749991, null), new qt8(au8Var2, (byte) 3), false);
                        }
                    }
                    if (wua.H1(i6, cgaVar.c)) {
                        if (savedStarGift2.unsaved) {
                            i = R.drawable.msg_message;
                            i2 = 2131749927;
                        } else {
                            i = R.drawable.menu_hide_gift;
                            i2 = 2131750146;
                        }
                        z = false;
                        J.b(i, ob6.M0(i2, str), new sa8(au8Var2, savedStarGift2, sx4Var2, (byte) 12), false);
                    } else {
                        z = false;
                    }
                    TL_stars.StarGift starGift2 = savedStarGift2.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final byte b5 = 2;
                        J.k(R.drawable.menu_transfer, ob6.M0(2131749864, str), new Runnable() { // from class: rt8
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b5;
                                TL_stars.SavedStarGift savedStarGift7 = savedStarGift2;
                                switch (b42) {
                                    case 0:
                                        au8 au8Var5 = au8Var2;
                                        zt8 zt8Var = new zt8(au8Var5, au8Var5.getContext(), au8Var5.b, au8Var5.a.c, au8Var5.c, (byte) 0);
                                        zt8Var.o2(savedStarGift7, null);
                                        zt8Var.B2(false);
                                        break;
                                    case 1:
                                        au8 au8Var6 = au8Var2;
                                        zt8 zt8Var2 = new zt8(au8Var6, au8Var6.getContext(), au8Var6.b, au8Var6.a.c, au8Var6.c, (byte) 1);
                                        zt8Var2.o2(savedStarGift7, null);
                                        zt8Var2.O1();
                                        break;
                                    default:
                                        au8 au8Var7 = au8Var2;
                                        zt8 zt8Var3 = new zt8(au8Var7, au8Var7.getContext(), au8Var7.b, au8Var7.a.c, au8Var7.c, (byte) 2);
                                        zt8Var3.o2(savedStarGift7, null);
                                        zt8Var3.b2();
                                        break;
                                }
                            }
                        }, wf3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == yac.h(i6).e() ? z2 : z);
                    }
                    if (zwaVar.h() && au8Var2.d) {
                        J.b(R.drawable.msg_removefolder, ob6.M0(2131749997, str), new sa8(au8Var2, savedStarGift2, J, (byte) 11), z2);
                        J.F();
                        J.t();
                    }
                    if (J.y() > 0) {
                        J.W(5);
                        J.u = z2;
                        J.v = z2;
                        J.L = z2;
                        Point point = hl.q;
                        int min = Math.min(point.x, point.y);
                        J.N = min - hl.L(32.0f);
                        J.O = (int) (min * 0.6f);
                        J.V = z2;
                        J.c0 = z2;
                        J.a0();
                        sx4Var2.E.getImageReceiver().w0(z2);
                        z4 = z2;
                    }
                    z4 = z;
                }
            }
            z = false;
            z4 = z;
        }
        return Boolean.valueOf(z4);
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        au8 au8Var = this.a;
        cga cgaVar = au8Var.a;
        int i = au8Var.b;
        if (au8Var.e != null) {
            Object obj3 = b8cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (!au8Var.h) {
                    wua wuaVar = new wua(au8Var.getContext(), au8Var.b, cgaVar.c, au8Var.c, null);
                    wuaVar.i3 = new qt8(au8Var, (byte) 2);
                    wuaVar.M2 = new m88((Object) au8Var, (Object) savedStarGift, (byte) 15);
                    wuaVar.o2(savedStarGift, au8Var.e);
                    wuaVar.show();
                    return;
                }
                if (au8Var.d || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                boolean z = savedStarGift.pinned_to_top;
                boolean z2 = !z;
                if (!z && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = au8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                }
                if (au8Var.e.q(savedStarGift, z2, true)) {
                    d31.b0(cgaVar.a).Q(R.raw.chats_infotip, 36, ob6.H(',', "GiftsPinLimit", uc7.s1(i).l4.R1.f())).j();
                }
                if (z) {
                    return;
                }
                au8Var.f.x0(0);
            }
        }
    }
}
