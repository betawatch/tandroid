package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.Components.cl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ z60 F;
    public final Context c;
    public final uf.k1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public x60(z60 z60Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.F = z60Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = z60Var.getContactsController();
        boolean z4 = z60Var.N;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = z60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.r.add(user2);
                hashSet.add(Long.valueOf(user2.id));
            }
        }
        if (z60Var.M || z60Var.L || z4) {
            ArrayList<TLRPC.Dialog> allDialogs = z60Var.getMessagesController().getAllDialogs();
            if (z4) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = z60Var.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                        this.r.add(user);
                        hashSet.add(Long.valueOf(user.id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.id) && (chat = z60Var.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.r.add(chat);
                    }
                }
            }
            Collections.sort(this.r, new t60());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i13);
                if (tLObject != null) {
                    String a2 = t60.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a10 = t60.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1))) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.r;
                String a11 = t60.a(tLObject2);
                arrayList2.add(i13, new y60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        uf.k1 k1Var = new uf.k1(false);
        this.f = k1Var;
        k1Var.a = new gu(this, 11);
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f == 0) {
            return false;
        }
        z60 z60Var = this.F;
        if (z60Var.G == null) {
            return true;
        }
        View view = m1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.g4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.g4) view).getObject();
        return !(object instanceof TLRPC.User) || z60Var.G.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        String str;
        String str2;
        if (this.n || i10 < this.B) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = this.B;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof y60) {
            return ((y60) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (LocaleController.nameDisplayOrder == 1) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        uf.k1 k1Var = this.f;
        z60 z60Var = this.F;
        k1Var.g(null, true, z60Var.L || z60Var.M, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        w60 w60Var = new w60(this, str, 0);
        this.h = w60Var;
        dispatchQueue.postRunnable(w60Var, 300L);
    }

    @Override // f2.p0
    public final int h() {
        int i10;
        z60 z60Var = this.F;
        long j10 = z60Var.E;
        long j11 = z60Var.D;
        this.D = -1;
        this.s = -1;
        this.w = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        if (this.n) {
            int size = this.d.size();
            uf.k1 k1Var = this.f;
            int size2 = k1Var.d.size();
            int size3 = k1Var.e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.E = i11;
            return i11;
        }
        if (z60Var.N) {
            this.w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z60Var.S) {
            int i12 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.x = i12;
        } else if (z60Var.T) {
            int i13 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.y = i13;
        } else {
            this.v = i10;
        }
        this.B = i10;
        int size4 = this.r.size() + i10;
        if (z60Var.O) {
            if (j11 != 0) {
                this.C = ChatObject.canUserDoAdminAction(z60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(j10));
                this.C = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
            } else {
                this.C = 0;
            }
            if (this.C != 0) {
                this.B++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.D = 0;
            size4++;
        }
        this.E = size4;
        return size4;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (this.n) {
            return i10 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i10 == this.w) {
            return 2;
        }
        if (i10 == this.s) {
            return 0;
        }
        if (i10 == this.x || i10 == this.y) {
            return 1;
        }
        if (this.C != 0 && i10 == 0) {
            return 2;
        }
        if (this.D == i10) {
            return 3;
        }
        int i11 = i10 - this.B;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.B) instanceof y60)) ? 1 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        this.F.r0();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String publicUsername;
        int i11 = m1Var.f;
        View view = m1Var.a;
        ArrayList arrayList = this.r;
        z60 z60Var = this.F;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (this.n) {
                u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i10 == this.s) {
                u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i12 = i10 - this.B;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.B);
                    if (tLObject2 instanceof y60) {
                        u3Var.setText(((y60) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i10 == this.v) {
                u3Var.b((z60Var.U == null && z60Var.W.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new f60(this, 2));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (i10 == this.w) {
                o8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                o8Var.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                return;
            } else if (this.C == 2) {
                o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                o8Var.e(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                return;
            } else {
                o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                o8Var.e(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        CharSequence charSequence3 = null;
        if (this.n) {
            int size = this.d.size();
            uf.k1 k1Var = this.f;
            ArrayList arrayList2 = k1Var.e;
            ArrayList arrayList3 = k1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) k1Var.e.get(((i10 - size) - size3) - 1) : (TLObject) arrayList3.get(i10 - size) : (TLObject) this.d.get(i10);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i10 < size) {
                    charSequence2 = (CharSequence) this.e.get(i10);
                    if (charSequence2 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence2.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = k1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = publicUsername;
                    }
                }
                CharSequence charSequence4 = charSequence3;
                charSequence3 = charSequence2;
                charSequence = charSequence4;
            }
            charSequence2 = null;
            CharSequence charSequence42 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence42;
        } else {
            if (i10 == this.x) {
                g4Var.r = true;
                g4Var.f = "premium";
                g4Var.a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.l5 l5Var = g4Var.c;
                int i13 = org.telegram.ui.ActionBar.k6.y6;
                l5Var.setTag(Integer.valueOf(i13));
                if (g4Var.H) {
                    i13 = org.telegram.ui.ActionBar.k6.og;
                }
                l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g4Var.J));
                l5Var.setEmojiColor(l5Var.getTextColor());
                l5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                g4Var.c(z60Var.U != null, false);
                return;
            }
            if (i10 == this.y) {
                g4Var.s = true;
                g4Var.f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = g4Var.a;
                g4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.l5 l5Var2 = g4Var.c;
                int i14 = org.telegram.ui.ActionBar.k6.y6;
                l5Var2.setTag(Integer.valueOf(i14));
                if (g4Var.H) {
                    i14 = org.telegram.ui.ActionBar.k6.og;
                }
                l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g4Var.J));
                l5Var2.setEmojiColor(l5Var2.getTextColor());
                l5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                g4Var.c(z60Var.V != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.B);
            charSequence = null;
        }
        g4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = z60Var.G;
            if (hVar == null || hVar.h(j10) < 0) {
                g4Var.c(z60Var.W.h(j10) >= 0, false);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.c;
        if (i10 == 0) {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 == 1) {
            u3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        } else if (i10 != 3) {
            u3Var = new org.telegram.ui.Cells.o8(context);
        } else {
            org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(context, null, 0, null, 1);
            x60Var.setLayoutParams(new f2.x0(-1, -1));
            x60Var.e.setVisibility(8);
            x60Var.d.setText(LocaleController.getString(R.string.NoContacts));
            x60Var.setAnimateLayoutChange(true);
            u3Var = x60Var;
        }
        return new org.telegram.ui.Components.el0(u3Var);
    }
}
