package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.ek;
import org.telegram.ui.rz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int a0 = 0;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public HashMap M;
    public int N;
    public final Paint O;
    public ArrayList P;
    public k7 Q;
    public Utilities.Callback R;
    public p7 S;
    public Utilities.Callback T;
    public g8 U;
    public final boolean V;
    public boolean W;
    public boolean X;
    public BitmapDrawable Y;
    public f8 Z;
    public ek b;
    public TLRPC.InputPeer c;
    public final ArrayList d;
    public final HashMap e;
    public int f;
    public final ArrayList h;
    public final ArrayList n;
    public final HashMap r;
    public int s;
    public final HashSet v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        char c3 = 0;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.r = hashMap2;
        this.s = 0;
        this.v = new HashSet();
        this.w = true;
        this.x = true;
        this.y = false;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = 0;
        this.F = 1;
        this.G = new ArrayList();
        this.J = 1;
        this.K = 4;
        this.M = new HashMap();
        this.N = 86400;
        this.O = new Paint(1);
        this.V = true;
        this.W = false;
        this.N = i10;
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i11 = 0;
            while (i11 < split2.length) {
                String[] split3 = split2[i11].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c3]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c3 = 0;
                }
                i11++;
                c3 = 0;
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (String str2 : split4) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (String str3 : split5) {
                String[] split6 = str3.split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < split6.length; i13++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i13])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (String str4 : split7) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(str4)));
                } catch (Exception unused5) {
                }
            }
        }
        this.s = l1(arrayList3, hashMap2).size();
        this.f = l1(arrayList, hashMap).size();
        this.x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.b.setAdapter(new e7(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new l6(3, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static ArrayList J0(c8 c8Var) {
        ArrayList h12 = c8Var.h1();
        int i10 = 0;
        while (i10 < h12.size()) {
            TLObject tLObject = (TLObject) h12.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                h12.remove(i10);
                i10--;
            }
            i10++;
        }
        return h12;
    }

    public static ArrayList Y0(c8 c8Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(c8Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.id));
                    if (user != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList Z0(c8 c8Var, boolean z4, boolean z10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(c8Var.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(c8Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!c8Var.X) {
                ContactsController.getInstance(c8Var.currentAccount).loadContacts(false, 0L);
            }
            c8Var.X = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.id));
                if (user2 != null && !user2.bot && user2.id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z4 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.id)) != null))) {
                    hashMap.put(Long.valueOf(user2.id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z10 && DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<Long, TLRPC.TL_contact>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int d1(c8 c8Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(c8Var.currentAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = c8Var.M;
        return (hashMap == null || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public static HashSet l1(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof w7) {
            return ((w7) currentView).P;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ek ekVar = this.b;
        if (ekVar == null) {
            return;
        }
        int i12 = 0;
        if (i10 == NotificationCenter.contactsDidLoad) {
            View[] viewPages = ekVar.getViewPages();
            View view = viewPages[0];
            if (view instanceof w7) {
                ((w7) view).g(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof w7) {
                ((w7) view2).g(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages2 = ekVar.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof w7) {
                        w7 w7Var = (w7) view3;
                        if (w7Var.a == 0) {
                            w7Var.g(true);
                        }
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        View[] viewPages3 = ekVar.getViewPages();
        while (i12 < viewPages3.length) {
            View view4 = viewPages3[i12];
            if (view4 instanceof w7) {
                w7 w7Var2 = (w7) view4;
                int i13 = w7Var2.a;
                if (i13 == 6) {
                    w7Var2.a(true);
                } else if (i13 == 0) {
                    w7Var2.g(true);
                }
            }
            i12++;
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        a8 a8Var;
        Utilities.Callback callback = this.R;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.r;
        ArrayList arrayList3 = this.n;
        if (callback != null) {
            int i10 = this.K;
            if (i10 == 3) {
                a8Var = new a8(this.K, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = a8Var.c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = a8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                a8Var = new a8(this.K, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = a8Var.c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = a8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else {
                a8Var = i10 == 2 ? new a8(i10, this.currentAccount, arrayList) : new a8(i10, this.currentAccount, (ArrayList) null);
            }
            this.R.run(a8Var);
            this.R = null;
        }
        ic.h(this.container);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.x).putBoolean("story_keep", this.y).apply();
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void e1(boolean z4) {
        this.B = z4;
        ek ekVar = this.b;
        if (ekVar != null) {
            for (View view : ekVar.getViewPages()) {
                if (view instanceof w7) {
                    ((w7) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        q7 q7Var;
        for (View view : this.b.getViewPages()) {
            if ((view instanceof w7) && (q7Var = ((w7) view).x) != null) {
                AndroidUtilities.hideKeyboard(q7Var.a);
            }
        }
    }

    public final void g1(a8 a8Var, Runnable runnable, boolean z4) {
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                String str = (String) this.P.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !a8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.isEmpty() || z4) {
            View view = this.b.getViewPages()[0];
            d dVar = view instanceof w7 ? ((w7) view).v : null;
            if (dVar != null) {
                dVar.setLoading(true);
            }
            k7 k7Var = this.Q;
            if (k7Var != null) {
                k7Var.e(a8Var, this.w, this.x, this.y, this.D, this.c, this.E, new l6(5, dVar, runnable), new org.telegram.ui.web.s0(dVar, 24));
                return;
            } else {
                runnable.run();
                return;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
            if (i11 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
            spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.StoryRestrictions);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new l1(this, a8Var, runnable, 1));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public final ArrayList h1() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i10);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final oh.t6 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        ic.a(this.container, new hg.w(12));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        this.O.setColor(org.telegram.ui.ActionBar.k6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i10, this.resourcesProvider));
        this.containerView = new rz(this, context);
        ek ekVar = new ek(this, context, 7);
        this.b = ekVar;
        int i11 = this.backgroundPaddingLeft;
        ekVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.b, k7.c6.e(-1, -1, 119));
    }

    public final void k1(boolean z4) {
        this.W = z4;
        ek ekVar = this.b;
        if (ekVar != null) {
            for (View view : ekVar.getViewPages()) {
                if (view instanceof w7) {
                    w7 w7Var = (w7) view;
                    w7Var.g(false);
                    w7Var.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        this.F = i10;
        ek ekVar = this.b;
        if (ekVar != null) {
            for (View view : ekVar.getViewPages()) {
                if (view instanceof w7) {
                    ((w7) view).e(false);
                }
            }
        }
    }

    public final void n1(Bitmap bitmap) {
        this.Y = bitmap == null ? null : new BitmapDrawable(bitmap);
        ek ekVar = this.b;
        if (ekVar != null) {
            for (View view : ekVar.getViewPages()) {
                if (view instanceof w7) {
                    w7 w7Var = (w7) view;
                    w7Var.g(false);
                    w7Var.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.H = true;
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w7) {
            w7 w7Var = (w7) view;
            w7Var.b(w7Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof w7) {
            w7 w7Var2 = (w7) view2;
            w7Var2.b(w7Var2.a);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (this.b.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        f1();
        this.b.D(r0.getCurrentPosition() - 1);
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.c = inputPeer;
        this.v.clear();
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w7) {
            w7 w7Var = (w7) view;
            w7Var.b(w7Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof w7) {
            w7 w7Var2 = (w7) view2;
            w7Var2.b(w7Var2.a);
        }
    }

    public final void q1(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        HashMap hashMap = a8Var.d;
        int i10 = a8Var.a;
        ArrayList arrayList = a8Var.c;
        this.K = i10;
        if (i10 == 2) {
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        } else if (i10 == 3) {
            ArrayList arrayList3 = this.n;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            HashMap hashMap2 = this.r;
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            this.s = l1(arrayList3, hashMap2).size();
        } else if (i10 == 4) {
            ArrayList arrayList4 = this.d;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            HashMap hashMap3 = this.e;
            hashMap3.clear();
            hashMap3.putAll(hashMap);
            this.f = l1(arrayList4, hashMap3).size();
        }
        if (i10 == 5) {
            this.L = true;
            this.J = 5;
            ArrayList arrayList5 = this.G;
            arrayList5.clear();
            arrayList5.addAll(a8Var.f);
            this.b.setPosition(1);
        }
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w7) {
            w7 w7Var = (w7) view;
            w7Var.b(w7Var.a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof w7) {
            w7 w7Var2 = (w7) view2;
            w7Var2.b(w7Var2.a);
        }
    }

    public c8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = 0;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 0;
        this.v = new HashSet();
        this.w = true;
        this.x = true;
        this.y = false;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = 0;
        this.F = 1;
        this.G = new ArrayList();
        this.J = 1;
        this.K = 4;
        this.M = new HashMap();
        this.N = 86400;
        this.O = new Paint(1);
        this.V = true;
        this.W = false;
        j1(context);
        this.b.setAdapter(new e7(this, context, 1));
    }
}
