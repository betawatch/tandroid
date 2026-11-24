// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qf4 extends d {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public ef4 J;
    public ff4 K;
    public lf4 L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hg5 S;
    public boolean T;
    public i74 U;
    public int V;
    public int W;
    public int X;
    public fv a;
    public nf4 b;
    public uja c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ub7 r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public qf4(ub7 ub7Var, ArrayList arrayList) {
        super(null);
        ub7 ub7Var2;
        this.d = -1;
        this.y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.r = ub7Var;
        if (ub7Var == null) {
            ub7 ub7Var3 = new ub7();
            this.r = ub7Var3;
            ub7Var3.a = 2;
            while (true) {
                Object obj = getMessagesController().J0.get(this.r.a);
                ub7Var2 = this.r;
                if (obj == null) {
                    break;
                } else {
                    ub7Var2.a++;
                }
            }
            ub7Var2.b = "";
            ub7Var2.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(gm.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m = gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m;
        this.x = k47.A5(m, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z = !this.r.n;
        this.y = z;
        vm.r(this.currentAccount, z);
        ub7 ub7Var4 = this.r;
        this.E = ub7Var4.g;
        this.F = ub7Var4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.r.i);
        this.I = this.r.j.clone();
    }

    public static CharSequence E0(int i, String str, boolean z) {
        Context context;
        if (i >= 0) {
            if (!oc7.d1().getBoolean("n_" + i, false) && (context = a.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z) {
                    Drawable d = b10.d(context, R.drawable.msg_other_new_outline);
                    d.setBounds(0, -gm.L(8.0f), d.getIntrinsicWidth(), d.getIntrinsicHeight() - gm.L(8.0f));
                    spannableString.setSpan(new xe4(d, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable d2 = b10.d(context, R.drawable.msg_other_new_filled);
                    Drawable d3 = b10.d(context, R.drawable.msg_other_new_filled_text);
                    int w0 = cmb.w0(null, cmb.Ji, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    d2.setColorFilter(new PorterDuffColorFilter(w0, mode));
                    d3.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.Ii, false), mode));
                    sn2 sn2Var = new sn2(d2, d3);
                    sn2Var.setBounds(0, 0, sn2Var.getIntrinsicWidth(), sn2Var.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(sn2Var, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    public static boolean j0(TLRPC.Chat chat) {
        if (sd2.y(3, chat)) {
            return true;
        }
        return sd2.t0(chat) && !chat.join_request;
    }

    public static boolean n0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            gn[] gnVarArr = (gn[]) spanned.getSpans(0, spanned.length(), gn.class);
            if (gnVarArr != null && gnVarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(ub7 ub7Var, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, Runnable runnable) {
        if (ub7Var.g != i || z4) {
            ub7Var.e = -1;
            if (z5) {
                ub7Var.d = -1;
            }
        }
        ub7Var.g = i;
        ub7Var.b = str;
        ub7Var.c = arrayList;
        ub7Var.m = i2;
        ub7Var.i = arrayList3;
        ub7Var.h = arrayList2;
        ub7Var.n = z;
        if (z2) {
            oc7 messagesController = dVar.getMessagesController();
            HashSet hashSet = messagesController.o4;
            ArrayList arrayList4 = messagesController.G0;
            if (z3) {
                int size = arrayList4.size();
                int i3 = nm7.c4;
                for (int i4 = 0; i4 < size; i4++) {
                    i3 = Math.min(i3, ((ub7) messagesController.G0.get(i4)).f);
                }
                ub7Var.f = i3 - 1;
                boolean d = ((ub7) messagesController.G0.get(0)).d();
                ArrayList arrayList5 = messagesController.G0;
                if (d) {
                    arrayList5.add(1, ub7Var);
                } else {
                    arrayList5.add(0, ub7Var);
                }
            } else {
                int size2 = arrayList4.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size2; i6++) {
                    i5 = Math.max(i5, ((ub7) messagesController.G0.get(i6)).f);
                }
                ub7Var.f = i5 + 1;
                messagesController.G0.add(ub7Var);
            }
            messagesController.J0.put(ub7Var.a, ub7Var);
            int i7 = ub7Var.a;
            if (i7 != 0 && hashSet.remove(Integer.valueOf(i7))) {
                messagesController.E4();
            }
            if (hashSet.contains(0)) {
                messagesController.b5(null);
            }
            if (messagesController.G0.size() == 1 && gda.m(messagesController.currentAccount) != 5) {
                gda.n1 = 5;
                a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gda.n1).apply();
            }
            messagesController.m3();
        } else {
            dVar.getMessagesController().A3(ub7Var);
        }
        cf7 messagesStorage = dVar.getMessagesStorage();
        messagesStorage.a.c(new yl6((Object) messagesStorage, (Object) ub7Var, z3, (byte) 4));
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = dVar.getMessagesController().S0();
            int size3 = S0.size();
            for (int i8 = 0; i8 < size3; i8 = td4.g(((ub7) S0.get(i8)).a, i8, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, d dVar, c41 c41Var) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new i46(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            mlb.y(null, 2131750585, c41Var, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            mlb.y(null, 2131750584, c41Var, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new i46(5, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new i46(12, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new i46(13, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            mlb.y(null, 2131747943, c41Var, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new i46(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            mlb.y(null, 2131743566, c41Var, null);
        } else {
            new i46(3, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
        }
    }

    public static void z0(final ub7 ub7Var, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final d dVar, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        he heVar = null;
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            he heVar2 = new he(3, null, dVar.getParentActivity());
            heVar2.j0 = false;
            heVar2.show();
            heVar = heVar2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = ub7Var.a;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i5 = oc7.s5;
        tL_dialogFilter.contacts = (i & 1) != 0;
        tL_dialogFilter.non_contacts = (i & 2) != 0;
        tL_dialogFilter.groups = (i & 4) != 0;
        tL_dialogFilter.broadcasts = (i & 8) != 0;
        tL_dialogFilter.bots = (i & 16) != 0;
        tL_dialogFilter.exclude_muted = (i & 32) != 0;
        tL_dialogFilter.exclude_read = (i & 64) != 0;
        tL_dialogFilter.exclude_archived = (i & 128) != 0;
        tL_dialogFilter.id = ub7Var.a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z;
        int i6 = tL_dialogFilter2.flags;
        if (i2 < 0) {
            tL_dialogFilter2.flags = i6 & (-134217729);
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags = i6 | TLObject.FLAG_27;
            tL_dialogFilter2.color = i2;
        }
        oc7 messagesController = dVar.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                long keyAt = longSparseIntArray.keyAt(i7);
                if (!pg3.B(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ne4(longSparseIntArray, (byte) 0));
        }
        int i8 = 0;
        while (i8 < i3) {
            TLRPC.TL_dialogFilter tL_dialogFilter3 = tL_messages_updateDialogFilter.filter;
            if (i8 == 0) {
                arrayList4 = tL_dialogFilter3.include_peers;
                arrayList5 = arrayList2;
            } else if (i8 == 1) {
                arrayList4 = tL_dialogFilter3.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_dialogFilter3.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i4 < size2) {
                ArrayList arrayList7 = arrayList5;
                Long l = (Long) arrayList7.get(i4);
                he heVar3 = heVar;
                int i9 = size2;
                long longValue = l.longValue();
                if ((i8 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !pg3.B(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User W1 = messagesController.W1(l);
                        if (W1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = W1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -longValue;
                        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
                        if (L0 != null) {
                            if (sd2.T(L0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = L0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i4++;
                heVar = heVar3;
                size2 = i9;
                arrayList5 = arrayList7;
            }
            i8++;
            i3 = 3;
            i4 = 0;
        }
        final he heVar4 = heVar;
        dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: te4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z7 = z6;
                final he heVar5 = heVar4;
                final ub7 ub7Var2 = ub7Var;
                final int i10 = i;
                final String str2 = str;
                final ArrayList arrayList8 = arrayList;
                final boolean z8 = z;
                final int i11 = i2;
                final ArrayList arrayList9 = arrayList2;
                final ArrayList arrayList10 = arrayList3;
                final boolean z9 = z2;
                final boolean z10 = z3;
                final boolean z11 = z4;
                final boolean z12 = z5;
                final d dVar2 = dVar;
                final Runnable runnable2 = runnable;
                gm.c3(new Runnable() { // from class: pe4
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z13 = z7;
                        Runnable runnable3 = runnable2;
                        if (!z13) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            he heVar6 = heVar5;
                            if (heVar6 != null) {
                                try {
                                    heVar6.dismiss();
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                            }
                            qf4.v0(ub7Var2, i10, str2, arrayList8, z8, i11, arrayList9, arrayList10, z9, z10, z11, z12, dVar2, runnable3);
                        }
                    }
                });
            }
        });
        if (z6) {
            return;
        }
        v0(ub7Var, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, dVar, null);
    }

    public final void A0(boolean z) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, z ? this.G : this.H, z);
        usersSelectActivity.G = this.r.c();
        usersSelectActivity.n = new s51((byte) 6, this, z);
        presentFragment(usersSelectActivity);
    }

    public final void B0(gf4 gf4Var, CharSequence charSequence, Object obj, boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131750644, null);
            if (obj instanceof String) {
                heVar.U = jb6.a0(null, null, 2131750645, charSequence);
            } else if (obj instanceof TLRPC.User) {
                heVar.U = jb6.a0(null, null, 2131750643, charSequence);
            } else {
                heVar.U = jb6.a0(null, null, 2131750646, charSequence);
            }
        } else {
            heVar.S = jb6.M0(2131750649, null);
            if (obj instanceof String) {
                heVar.U = jb6.a0(null, null, 2131750650, charSequence);
            } else if (obj instanceof TLRPC.User) {
                heVar.U = jb6.a0(null, null, 2131750648, charSequence);
            } else {
                heVar.U = jb6.a0(null, null, 2131750651, charSequence);
            }
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131744544, null), new ci((Object) this, (Object) gf4Var, z, (byte) 8));
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void C0() {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.P;
        arrayList3.clear();
        ArrayList arrayList4 = this.Q;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        String M0 = jb6.M0(2131750670, null);
        String M02 = n0(this.x) ? jb6.M0(this.y ? 2131750672 : 2131750671, null) : null;
        final byte b = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: oe4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                byte b3 = 1;
                qf4 qf4Var = this.b;
                switch (b2) {
                    case 0:
                        ub7 ub7Var = qf4Var.r;
                        if (ub7Var != null && ub7Var.c()) {
                            ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                            String M03 = jb6.M0(2131750727, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M03;
                            heVar.U = jb6.M0(2131750726, null);
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b3));
                            qf4Var.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        qf4Var.q0();
                        break;
                    case 2:
                        qf4Var.A0(true);
                        break;
                    case 3:
                        qf4Var.e = true;
                        qf4Var.C0();
                        break;
                    case 4:
                        qf4Var.A0(false);
                        break;
                    default:
                        qf4Var.f = true;
                        qf4Var.C0();
                        break;
                }
            }
        };
        final byte b2 = 0;
        gf4 gf4Var = new gf4(11, false);
        gf4Var.d = M0;
        gf4Var.e = M02;
        gf4Var.c = onClickListener;
        arrayList4.add(gf4Var);
        this.d = arrayList4.size();
        final byte b3 = 2;
        arrayList4.add(new gf4(2, false));
        arrayList4.add(gf4.d(null));
        String M03 = jb6.M0(2131750710, null);
        gf4 gf4Var2 = new gf4(0, false);
        gf4Var2.d = M03;
        arrayList4.add(gf4Var2);
        gf4 b4 = gf4.b(R.drawable.msg2_chats_add, jb6.M0(2131750750, null), false);
        b4.c = new View.OnClickListener(this) { // from class: oe4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                byte b32 = 1;
                qf4 qf4Var = this.b;
                switch (b22) {
                    case 0:
                        ub7 ub7Var = qf4Var.r;
                        if (ub7Var != null && ub7Var.c()) {
                            ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                            String M032 = jb6.M0(2131750727, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M032;
                            heVar.U = jb6.M0(2131750726, null);
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b32));
                            qf4Var.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        qf4Var.q0();
                        break;
                    case 2:
                        qf4Var.A0(true);
                        break;
                    case 3:
                        qf4Var.e = true;
                        qf4Var.C0();
                        break;
                    case 4:
                        qf4Var.A0(false);
                        break;
                    default:
                        qf4Var.f = true;
                        qf4Var.C0();
                        break;
                }
            }
        };
        arrayList4.add(b4);
        int i2 = this.E;
        int i3 = oc7.s5;
        if ((i2 & 1) != 0) {
            arrayList4.add(gf4.c(1, jb6.M0(2131750728, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList4.add(gf4.c(2, jb6.M0(2131750655, null), "non_contacts", true));
        }
        final byte b5 = 4;
        if ((this.E & 4) != 0) {
            arrayList4.add(gf4.c(4, jb6.M0(2131750711, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList4.add(gf4.c(8, jb6.M0(2131750737, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList4.add(gf4.c(16, jb6.M0(2131750738, null), "bots", true));
        }
        int i4 = 5;
        if (this.G.isEmpty()) {
            i = 5;
        } else {
            int size = (this.e || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
            int i5 = 0;
            while (true) {
                arrayList2 = this.G;
                if (i5 >= size) {
                    break;
                }
                long longValue = ((Long) arrayList2.get(i5)).longValue();
                int i6 = i4;
                gf4 gf4Var3 = new gf4(1, false);
                gf4Var3.g = true;
                gf4Var3.h = longValue;
                arrayList4.add(gf4Var3);
                i5++;
                i4 = i6;
            }
            i = i4;
            if (size != arrayList2.size()) {
                gf4 b6 = gf4.b(R.drawable.arrow_more, jb6.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                final byte b7 = 3;
                b6.c = new View.OnClickListener(this) { // from class: oe4
                    public final /* synthetic */ qf4 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b7;
                        byte b32 = 1;
                        qf4 qf4Var = this.b;
                        switch (b22) {
                            case 0:
                                ub7 ub7Var = qf4Var.r;
                                if (ub7Var != null && ub7Var.c()) {
                                    ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                    String M032 = jb6.M0(2131750727, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M032;
                                    heVar.U = jb6.M0(2131750726, null);
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b32));
                                    qf4Var.showDialog(heVar);
                                    TextView textView = (TextView) heVar.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, null);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                qf4Var.q0();
                                break;
                            case 2:
                                qf4Var.A0(true);
                                break;
                            case 3:
                                qf4Var.e = true;
                                qf4Var.C0();
                                break;
                            case 4:
                                qf4Var.A0(false);
                                break;
                            default:
                                qf4Var.f = true;
                                qf4Var.C0();
                                break;
                        }
                    }
                };
                arrayList4.add(b6);
            }
        }
        arrayList4.add(gf4.d(jb6.M0(2131750709, null)));
        ub7 ub7Var = this.r;
        if (!ub7Var.c()) {
            String M04 = jb6.M0(2131750715, null);
            gf4 gf4Var4 = new gf4(0, false);
            gf4Var4.d = M04;
            arrayList4.add(gf4Var4);
            gf4 b8 = gf4.b(R.drawable.msg2_chats_add, jb6.M0(2131750652, null), false);
            b8.c = new View.OnClickListener(this) { // from class: oe4
                public final /* synthetic */ qf4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b5;
                    byte b32 = 1;
                    qf4 qf4Var = this.b;
                    switch (b22) {
                        case 0:
                            ub7 ub7Var2 = qf4Var.r;
                            if (ub7Var2 != null && ub7Var2.c()) {
                                ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                String M032 = jb6.M0(2131750727, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M032;
                                heVar.U = jb6.M0(2131750726, null);
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b32));
                                qf4Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            qf4Var.q0();
                            break;
                        case 2:
                            qf4Var.A0(true);
                            break;
                        case 3:
                            qf4Var.e = true;
                            qf4Var.C0();
                            break;
                        case 4:
                            qf4Var.A0(false);
                            break;
                        default:
                            qf4Var.f = true;
                            qf4Var.C0();
                            break;
                    }
                }
            };
            arrayList4.add(b8);
            int i7 = this.E;
            int i8 = oc7.s5;
            if ((i7 & 32) != 0) {
                arrayList4.add(gf4.c(32, jb6.M0(2131750673, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList4.add(gf4.c(64, jb6.M0(2131750654, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList4.add(gf4.c(128, jb6.M0(2131750741, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                int size2 = (this.f || this.H.size() < 8) ? this.H.size() : Math.min(i, this.H.size());
                int i9 = 0;
                while (true) {
                    arrayList = this.H;
                    if (i9 >= size2) {
                        break;
                    }
                    long longValue2 = ((Long) arrayList.get(i9)).longValue();
                    gf4 gf4Var5 = new gf4(1, false);
                    gf4Var5.g = false;
                    gf4Var5.h = longValue2;
                    arrayList4.add(gf4Var5);
                    i9++;
                }
                if (size2 != arrayList.size()) {
                    final byte b9 = 5;
                    gf4 b10 = gf4.b(R.drawable.arrow_more, jb6.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b10.c = new View.OnClickListener(this) { // from class: oe4
                        public final /* synthetic */ qf4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b22 = b9;
                            byte b32 = 1;
                            qf4 qf4Var = this.b;
                            switch (b22) {
                                case 0:
                                    ub7 ub7Var2 = qf4Var.r;
                                    if (ub7Var2 != null && ub7Var2.c()) {
                                        ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                        String M032 = jb6.M0(2131750727, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M032;
                                        heVar.U = jb6.M0(2131750726, null);
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b32));
                                        qf4Var.showDialog(heVar);
                                        TextView textView = (TextView) heVar.c(-1);
                                        if (textView != null) {
                                            anb.X(textView, cmb.p7, null);
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    qf4Var.q0();
                                    break;
                                case 2:
                                    qf4Var.A0(true);
                                    break;
                                case 3:
                                    qf4Var.e = true;
                                    qf4Var.C0();
                                    break;
                                case 4:
                                    qf4Var.A0(false);
                                    break;
                                default:
                                    qf4Var.f = true;
                                    qf4Var.C0();
                                    break;
                            }
                        }
                    };
                    arrayList4.add(b10);
                }
            }
            arrayList4.add(gf4.d(jb6.M0(2131750714, null)));
        }
        if (getMessagesController().m4 || !getUserConfig().p()) {
            arrayList4.add(new gf4(9, false));
            arrayList4.add(new gf4(10, false));
            arrayList4.add(gf4.d(jb6.M0(2131750553, null)));
        }
        ArrayList arrayList5 = this.M;
        if (arrayList5.isEmpty()) {
            String M05 = jb6.M0(2131750640, null);
            gf4 gf4Var6 = new gf4(0, false);
            gf4Var6.d = M05;
            gf4Var6.f = true;
            arrayList4.add(gf4Var6);
            arrayList4.add(gf4.b(R.drawable.msg2_link2, jb6.M0(2131750639, null), false));
            arrayList4.add(gf4.d(jb6.M0(2131750680, null)));
        } else {
            String M06 = jb6.M0(2131750682, null);
            gf4 gf4Var7 = new gf4(0, false);
            gf4Var7.d = M06;
            gf4Var7.f = true;
            arrayList4.add(gf4Var7);
            arrayList4.add(new gf4(8, false));
            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList5.get(i10);
                gf4 gf4Var8 = new gf4(7, false);
                gf4Var8.m = tL_exportedChatlistInvite;
                arrayList4.add(gf4Var8);
            }
            arrayList4.add(gf4.d(ub7Var.c() ? jb6.M0(2131750680, null) : jb6.M0(2131750681, null)));
        }
        if (!this.s) {
            gf4 b11 = gf4.b(0, jb6.M0(2131750727, null), true);
            b11.c = new View.OnClickListener(this) { // from class: oe4
                public final /* synthetic */ qf4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b2;
                    byte b32 = 1;
                    qf4 qf4Var = this.b;
                    switch (b22) {
                        case 0:
                            ub7 ub7Var2 = qf4Var.r;
                            if (ub7Var2 != null && ub7Var2.c()) {
                                ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                String M032 = jb6.M0(2131750727, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M032;
                                heVar.U = jb6.M0(2131750726, null);
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, b32));
                                qf4Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            qf4Var.q0();
                            break;
                        case 2:
                            qf4Var.A0(true);
                            break;
                        case 3:
                            qf4Var.e = true;
                            qf4Var.C0();
                            break;
                        case 4:
                            qf4Var.A0(false);
                            break;
                        default:
                            qf4Var.f = true;
                            qf4Var.C0();
                            break;
                    }
                }
            };
            arrayList4.add(b11);
            arrayList4.add(gf4.d(null));
        }
        nf4 nf4Var = this.b;
        if (nf4Var != null) {
            nf4Var.E(arrayList3, arrayList4);
        }
    }

    public final void D0() {
        int hiddenChildCount;
        View W;
        try {
            if (this.a != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.Yl, false);
                if (w0 == this.W && w02 == this.X) {
                    return;
                }
                this.W = w0;
                this.X = w02;
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.a.getChildCount();
                    } else {
                        fv fvVar = this.a;
                        hiddenChildCount = i == 1 ? fvVar.getHiddenChildCount() : i == 2 ? fvVar.getCachedChildCount() : fvVar.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            W = this.a.getChildAt(i2);
                        } else {
                            fv fvVar2 = this.a;
                            W = i == 1 ? fvVar2.W(i2) : i == 2 ? fvVar2.P(i2) : fvVar2.O(i2);
                        }
                        if (W instanceof w8c) {
                            w8c w8cVar = (w8c) W;
                            w8cVar.b0 = true;
                            w8cVar.R = w0;
                            w8cVar.S = w02;
                            if (i != 0) {
                                ((w8c) W).i(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.s;
        rja rjaVar = this.simpleActionBar;
        ub7 ub7Var = this.r;
        byte b = 0;
        if (z) {
            rjaVar.setTitle(jb6.M0(2131750665, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = rjaVar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(k47.A5(gw3.m(ub7Var.b, titleFontMetricsInt, false, null, 0), ub7Var.c, titleFontMetricsInt, false));
            rja rjaVar2 = this.simpleActionBar;
            if (rjaVar2 != null) {
                if (rjaVar2.getTitleTextView() != null) {
                    this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
                }
            }
        }
        byte b2 = 17;
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, b2));
        this.c = this.simpleActionBar.s(jb6.M0(this.s ? 2131751690 : 2131745680, null));
        w91 w91Var = new w91((byte) 2, context, this);
        this.fragmentView = w91Var;
        fv fvVar = new fv(b2, context, this);
        this.a = fvVar;
        fvVar.r1();
        this.a.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        w91Var.addView(this.a, qoe.c(-1.0f, -1));
        fv fvVar2 = this.a;
        nf4 nf4Var = new nf4(this, context);
        this.b = nf4Var;
        fvVar2.setAdapter(nf4Var);
        this.a.setOnItemClickListener(new u(this, (byte) 28));
        this.a.setOnItemLongClickListener(new qe4(this, b));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.a.setItemAnimator(sc3Var);
        this.a.setOnScrollListener(new ip2(this, (byte) 11));
        l0(false);
        if (!this.O && ub7Var != null && ub7Var.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ue4(this, b));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 4);
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, xib.class, w8c.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.p6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"ImageView"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean k0(boolean z) {
        if (!this.c.x.f) {
            return true;
        }
        if (!z) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        boolean z2 = this.s;
        he heVar = alertDialog$Builder.a;
        if (z2) {
            heVar.S = jb6.M0(2131750720, null);
            heVar.U = jb6.M0(2131750722, null);
            alertDialog$Builder.j(jb6.M0(2131750721, null), new qe4(this, (byte) 2));
        } else {
            heVar.S = jb6.M0(2131750719, null);
            heVar.U = jb6.M0(2131750723, null);
            alertDialog$Builder.j(jb6.M0(2131754181, null), new qe4(this, (byte) 3));
        }
        alertDialog$Builder.g(jb6.M0(2131747313, null), new qe4(this, (byte) 4));
        showDialog(heVar);
        return false;
    }

    public final void l0(boolean z) {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.x) && this.x.length() <= 12;
        if (z3) {
            z3 = ((this.E & oc7.t5) == 0 && this.G.isEmpty()) ? false : true;
            if (z3 && !this.s) {
                this.h = false;
                ub7 ub7Var = this.r;
                if (ub7Var.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (ub7Var.i.size() != this.H.size()) {
                    this.h = true;
                }
                if (ub7Var.m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(ub7Var.h);
                    Collections.sort(this.G);
                    if (!ub7Var.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(ub7Var.i);
                    Collections.sort(this.H);
                    if (!ub7Var.i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (ub7Var.n == (!this.y) && TextUtils.equals(ub7Var.b, this.x) && ub7Var.g == this.E) {
                    z2 = this.h;
                }
                z3 = z2;
            }
        }
        this.c.a(z3, z);
    }

    public final void m0() {
        String M0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i = this.E;
                int i2 = oc7.t5;
                int i3 = i & i2;
                if ((i3 & i2) == i2) {
                    if ((i & 64) != 0) {
                        M0 = jb6.M0(2131750667, null);
                    } else {
                        if ((i & 32) != 0) {
                            M0 = jb6.M0(2131750668, null);
                        }
                        M0 = "";
                    }
                } else if ((i3 & 1) != 0) {
                    if ((i3 & (-2)) == 0) {
                        M0 = jb6.M0(2131750728, null);
                    }
                    M0 = "";
                } else if ((i3 & 2) != 0) {
                    if ((i3 & (-3)) == 0) {
                        M0 = jb6.M0(2131750655, null);
                    }
                    M0 = "";
                } else if ((i3 & 4) != 0) {
                    if ((i3 & (-5)) == 0) {
                        M0 = jb6.M0(2131750711, null);
                    }
                    M0 = "";
                } else if ((i3 & 16) != 0) {
                    if ((i3 & (-17)) == 0) {
                        M0 = jb6.M0(2131750738, null);
                    }
                    M0 = "";
                } else {
                    if ((i3 & 8) != 0 && (i3 & (-9)) == 0) {
                        M0 = jb6.M0(2131750737, null);
                    }
                    M0 = "";
                }
                String str = M0.length() <= 12 ? M0 : "";
                this.x = str;
                ef4 ef4Var = this.J;
                if (ef4Var != null) {
                    ef4Var.e(gn.cloneSpans(str, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                u69 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void o0() {
        oc7 messagesController = getMessagesController();
        ub7 ub7Var = this.r;
        messagesController.s5(ub7Var);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < ub7Var.h.size(); i++) {
            long longValue = ((Long) ub7Var.h.get(i)).longValue();
            if (longValue < 0 && j0(getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(getMessagesController().i1(longValue));
            }
        }
        if (arrayList.size() > (getUserConfig().p() ? getMessagesController().l4.c1 : getMessagesController().l4.b1).f()) {
            showDialog(new i46(4, this.currentAccount, null, getParentActivity(), this));
            return;
        }
        if (arrayList.isEmpty()) {
            me4 me4Var = new me4(ub7Var, null);
            me4Var.y = new re4(this, (byte) 3);
            me4Var.x = new re4(this, (byte) 4);
            presentFragment(me4Var);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new ue4(this, (byte) 1));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        du3 du3Var;
        lf4 lf4Var = this.L;
        if (lf4Var == null || (du3Var = lf4Var.b) == null || !du3Var.e) {
            return k0(z);
        }
        if (!z) {
            return false;
        }
        du3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        lf4 lf4Var;
        View view = this.fragmentView;
        if (view == null || (lf4Var = this.L) == null || !lf4Var.b.e) {
            return;
        }
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        C0();
        i74 i74Var = this.U;
        if (i74Var != null) {
            i74Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        du3 du3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                lf4 lf4Var = this.L;
                if (lf4Var != null && (du3Var = lf4Var.b) != null && du3Var.getEditText() != null && (themedColor = getThemedColor(cmb.Ei)) != this.V) {
                    this.V = themedColor;
                    this.L.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void p0() {
        if (!this.w) {
            finishFragment();
            return;
        }
        this.w = false;
        Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
        ub7 ub7Var = this.r;
        Spannable A5 = k47.A5(gw3.m(ub7Var.b, titleFontMetricsInt, false, null, 0), ub7Var.c, titleFontMetricsInt, false);
        rja rjaVar = this.simpleActionBar;
        rjaVar.getClass();
        rjaVar.I(A5, true, 220L, d53.h);
    }

    public final void q0() {
        this.y = !this.y;
        ff4 ff4Var = this.K;
        if (ff4Var != null) {
            rj rjVar = ff4Var.r;
            String str = null;
            if (n0(this.x)) {
                str = jb6.M0(this.y ? 2131750672 : 2131750671, null);
            }
            rjVar.setText(str);
        }
        vm.r(this.currentAccount, this.y);
        l0(true);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            if (rjaVar.getTitleTextView() != null) {
                this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
            }
            if (this.simpleActionBar.getTitleTextView2() != null) {
                this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i = 0;
            while (true) {
                arrayList = this.M;
                if (i >= arrayList.size()) {
                    i = -1;
                    break;
                } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ub7 ub7Var = this.r;
                    int i2 = ub7Var.g;
                    int i3 = oc7.s5;
                    ub7Var.g = i2 & (-513);
                }
                C0();
            }
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            arrayList = this.M;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i, boolean z) {
        ub7 ub7Var;
        if (this.T || (ub7Var = this.r) == null || !ub7Var.c() || !ub7Var.e()) {
            return;
        }
        this.T = true;
        this.U = new i74((Object) this, z, i, (byte) 1);
        if (getLayoutContainer() != null) {
            this.U.run();
            this.U = null;
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        int size;
        int i;
        if (arrayList != null) {
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!arrayList2.contains(arrayList.get(i2))) {
                    i++;
                }
            }
            size = 0;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (!arrayList.contains(arrayList2.get(i3))) {
                    size++;
                }
            }
        } else {
            size = arrayList2.size();
            i = 0;
        }
        if (!z) {
            if (size > 0) {
                t0(size, false);
            }
        } else if (size > 0 && size > i) {
            t0(size, true);
        } else if (i > 0) {
            t0(i, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        hg5 hg5Var = this.S;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.S = null;
        }
        y0(new se4(this, (byte) 0), true);
    }

    public final void y0(Runnable runnable, boolean z) {
        CharSequence[] charSequenceArr = {this.x};
        z0(this.r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), !this.y, this.F, this.G, this.H, this.I, this.s, false, this.h, true, z, this, new ve4(this, runnable, (byte) 1));
    }
}
