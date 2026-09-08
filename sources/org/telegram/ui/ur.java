package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ur extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final hg.b2 h;
    public sr n;
    public boolean s;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ vr y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public ur(vr vrVar, Context context) {
        this.y = vrVar;
        this.c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.h = b2Var;
        b2Var.a = new tr(this);
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final TLObject E(int i10) {
        hg.b2 b2Var = this.h;
        int size = b2Var.g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) b2Var.g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = b2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) b2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        if (this.n != null) {
            Utilities.searchQueue.cancelRunnable(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        hg.b2 b2Var = this.h;
        vr vrVar = this.y;
        b2Var.g(null, vrVar.O != 0, false, true, false, ChatObject.isChannel(vrVar.r) ? this.y.N : 0L, false, this.y.O, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.y.b.e(true, true);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        sr srVar = new sr(this, str, 0);
        this.n = srVar;
        dispatchQueue.postRunnable(srVar, 300L);
    }

    @Override // s4.h0
    public final int h() {
        return this.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (i10 == this.x || i10 == this.v || i10 == this.w) ? 1 : 0;
    }

    @Override // s4.h0
    public final void l() {
        bi.o0 o0Var;
        this.r = 0;
        hg.b2 b2Var = this.h;
        int size = b2Var.g.size();
        if (size != 0) {
            this.v = 0;
            this.r = size + 1 + this.r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.r;
            this.w = i10;
            this.r = size2 + 1 + i10;
        } else {
            this.w = -1;
        }
        int size3 = b2Var.e.size();
        if (size3 != 0) {
            int i11 = this.r;
            this.x = i11;
            this.r = size3 + 1 + i11;
        } else {
            this.x = -1;
        }
        vr vrVar = this.y;
        if (vrVar.o1 && (o0Var = vrVar.c) != null) {
            s4.h0 adapter = o0Var.getAdapter();
            ur urVar = vrVar.e;
            if (adapter != urVar) {
                bi.o0 o0Var2 = vrVar.c;
                o0Var2.Y1 = true;
                o0Var2.Z1 = 0;
                o0Var2.setAdapter(urVar);
                vrVar.c.setFastScrollVisible(false);
                vrVar.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        String publicUsername;
        TLObject tLObject;
        int size;
        String str;
        boolean z10;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        int indexOfIgnoreCase;
        int size2;
        int size3;
        int i11;
        String str4;
        int i12 = c1Var.f;
        View view = c1Var.a;
        vr vrVar = this.y;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != this.v) {
                if (i10 == this.x) {
                    u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i10 == this.w) {
                        u3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i13 = vrVar.O;
            if (i13 == 0) {
                u3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i13 == 3) {
                u3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (vrVar.v) {
                u3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                u3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            }
        }
        TLObject E = E(i10);
        boolean z11 = E instanceof TLRPC.User;
        TLObject tLObject2 = E;
        if (!z11) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                if (peerId >= 0) {
                    TLRPC.User user = vrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    tLObject2 = user;
                    if (user != null) {
                        publicUsername = UserObject.getPublicUsername(user);
                        tLObject = user;
                        hg.b2 b2Var = this.h;
                        size = b2Var.g.size();
                        if (size != 0) {
                            int i14 = size + 1;
                            if (i14 > i10) {
                                str = b2Var.n;
                                z10 = true;
                                if (!z10 && (size3 = this.d.size()) != 0) {
                                    i11 = size3 + 1;
                                    if (i11 <= i10) {
                                        CharSequence charSequence = (CharSequence) this.f.get(i10 - 1);
                                        if (charSequence != 0 && !TextUtils.isEmpty(publicUsername)) {
                                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                                spannableStringBuilder = null;
                                                str4 = charSequence;
                                                z10 = true;
                                                str2 = str4;
                                                str3 = str2;
                                                str3 = str2;
                                                if (!z10 && publicUsername != null) {
                                                    size2 = b2Var.e.size();
                                                    str3 = str2;
                                                    if (size2 != 0) {
                                                        str3 = str2;
                                                        if (size2 + 1 > i10) {
                                                            String str5 = b2Var.c;
                                                            if (str5.startsWith("@")) {
                                                                str5 = str5.substring(1);
                                                            }
                                                            try {
                                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                                spannableStringBuilder2.append((CharSequence) "@");
                                                                spannableStringBuilder2.append((CharSequence) publicUsername);
                                                                int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, str5);
                                                                str3 = spannableStringBuilder2;
                                                                if (indexOfIgnoreCase2 != -1) {
                                                                    int length = str5.length();
                                                                    if (indexOfIgnoreCase2 == 0) {
                                                                        length++;
                                                                    } else {
                                                                        indexOfIgnoreCase2++;
                                                                    }
                                                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                                                    str3 = spannableStringBuilder2;
                                                                }
                                                            } catch (Exception e7) {
                                                                FileLog.e(e7);
                                                                str3 = publicUsername;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (str != null && publicUsername != null) {
                                                    spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                                    indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                                    if (indexOfIgnoreCase != -1) {
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                    }
                                                }
                                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                                                a5Var.setTag(Integer.valueOf(i10));
                                                a5Var.b(tLObject, spannableStringBuilder, str3, false);
                                            }
                                        }
                                        str4 = null;
                                        spannableStringBuilder = charSequence;
                                        z10 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z10) {
                                            size2 = b2Var.e.size();
                                            str3 = str2;
                                            if (size2 != 0) {
                                            }
                                        }
                                        if (str != null) {
                                            spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                            if (indexOfIgnoreCase != -1) {
                                            }
                                        }
                                        org.telegram.ui.Cells.a5 a5Var2 = (org.telegram.ui.Cells.a5) view;
                                        a5Var2.setTag(Integer.valueOf(i10));
                                        a5Var2.b(tLObject, spannableStringBuilder, str3, false);
                                    }
                                    i10 -= i11;
                                }
                                str2 = null;
                                spannableStringBuilder = null;
                                str3 = str2;
                                str3 = str2;
                                if (!z10) {
                                }
                                if (str != null) {
                                }
                                org.telegram.ui.Cells.a5 a5Var22 = (org.telegram.ui.Cells.a5) view;
                                a5Var22.setTag(Integer.valueOf(i10));
                                a5Var22.b(tLObject, spannableStringBuilder, str3, false);
                            }
                            i10 -= i14;
                        }
                        str = null;
                        z10 = false;
                        if (!z10) {
                            i11 = size3 + 1;
                            if (i11 <= i10) {
                            }
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z10) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.a5 a5Var222 = (org.telegram.ui.Cells.a5) view;
                        a5Var222.setTag(Integer.valueOf(i10));
                        a5Var222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                } else {
                    TLRPC.Chat chat = vrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    tLObject2 = chat;
                    if (chat != null) {
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                        hg.b2 b2Var2 = this.h;
                        size = b2Var2.g.size();
                        if (size != 0) {
                        }
                        str = null;
                        z10 = false;
                        if (!z10) {
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z10) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.a5 a5Var2222 = (org.telegram.ui.Cells.a5) view;
                        a5Var2222.setTag(Integer.valueOf(i10));
                        a5Var2222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                }
            } else if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = vrVar.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        publicUsername = null;
        tLObject = tLObject2;
        hg.b2 b2Var22 = this.h;
        size = b2Var22.g.size();
        if (size != 0) {
        }
        str = null;
        z10 = false;
        if (!z10) {
        }
        str2 = null;
        spannableStringBuilder = null;
        str3 = str2;
        str3 = str2;
        if (!z10) {
        }
        if (str != null) {
        }
        org.telegram.ui.Cells.a5 a5Var22222 = (org.telegram.ui.Cells.a5) view;
        a5Var22222.setTag(Integer.valueOf(i10));
        a5Var22222.b(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        vr vrVar = this.y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.n2) vrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.c, 26, f6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.c, null, vrVar.e1 == 0);
            a5Var.G = true;
            a5Var.setDelegate(new tr(this));
            view = a5Var;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
