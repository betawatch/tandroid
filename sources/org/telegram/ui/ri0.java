package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ri0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ ti0 d;

    public ri0(ti0 ti0Var, Context context) {
        this.d = ti0Var;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f == 0) {
            return ((org.telegram.ui.Cells.b5) q1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.M;
    }

    @Override // f2.r0
    public final int j(int i9) {
        ti0 ti0Var = this.d;
        if (ti0Var.N.contains(Integer.valueOf(i9))) {
            return 1;
        }
        if (i9 == ti0Var.D || i9 == ti0Var.K) {
            return 2;
        }
        if (i9 == ti0Var.G) {
            return 3;
        }
        if (i9 == ti0Var.H) {
            return 4;
        }
        if (i9 == ti0Var.J) {
            return 5;
        }
        if (i9 == ti0Var.L) {
            return 6;
        }
        return i9 == ti0Var.I ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.User user;
        String format;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = q1Var.f;
        View view = q1Var.a;
        int i15 = 9;
        ti0 ti0Var = this.d;
        if (i14 != 0) {
            if (i14 == 1) {
                view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                return;
            }
            if (i14 == 2) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == ti0Var.K) {
                    m4Var.setTopMargin(9);
                    m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    m4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                } else {
                    m4Var.setTopMargin(11);
                    m4Var.setPadding(0, 0, 0, 0);
                    m4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                    return;
                }
            }
            if (i14 == 4) {
                c91 c91Var = (c91) view;
                c91Var.e(ti0Var.r, false);
                c91Var.setLayoutParams(new f2.a1(-1, -2));
                return;
            }
            if (i14 != 5) {
                if (i14 != 7) {
                    return;
                }
                c91 c91Var2 = (c91) view;
                c91Var2.e(ti0Var.s, false);
                c91Var2.setLayoutParams(new f2.a1(-1, -2));
                return;
            }
            si0 si0Var = (si0) view;
            TextView[] textViewArr = si0Var.a;
            TextView[] textViewArr2 = si0Var.b;
            ti0 ti0Var2 = si0Var.c;
            p91 p91Var = ti0Var2.a0;
            MessageObject messageObject = ti0Var2.n;
            if (p91Var != null) {
                i12 = p91Var.d();
                i11 = p91Var.a();
                i13 = p91Var.c();
            } else {
                int i16 = messageObject.isStory() ? messageObject.storyItem.views.views_count : messageObject.messageOwner.views;
                i11 = messageObject.isStory() ? messageObject.storyItem.views.forwards_count : messageObject.messageOwner.forwards;
                if (messageObject.isStory()) {
                    int i17 = messageObject.storyItem.views.reactions_count;
                    i12 = i16;
                    i13 = i17;
                } else if (messageObject.messageOwner.reactions != null) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < messageObject.messageOwner.reactions.results.size(); i19++) {
                        i18 += messageObject.messageOwner.reactions.results.get(i19).count;
                    }
                    i12 = i16;
                    i13 = i18;
                } else {
                    i12 = i16;
                    i13 = 0;
                }
            }
            textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i12, 0));
            textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(ti0Var2.Q, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i13, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = ti0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i13 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i11 - ti0Var2.Q), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            si0Var.a();
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i20 = ti0Var.E;
        MessageObject messageObject2 = (i9 < i20 || i9 >= ti0Var.F) ? null : (MessageObject) ti0Var.x.get(i9 - i20);
        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
        if (messageObject2.isStory()) {
            TLObject user2 = DialogObject.isUserDialog(dialogId) ? ti0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : ti0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            TL_stories.StoryViews storyViews = messageObject2.storyItem.views;
            b5Var.b(user2, null, (storyViews == null || (i10 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i10, new Object[0]), i9 != ti0Var.F - 1);
            TL_stories.StoryItem storyItem = messageObject2.storyItem;
            v80 v80Var = new v80(i15, this, messageObject2);
            b5Var.r = storyItem;
            b5Var.a.setOnClickListener(v80Var);
            return;
        }
        b5Var.r = null;
        b5Var.a.setOnClickListener(null);
        if (!DialogObject.isUserDialog(dialogId)) {
            TLRPC.Chat chat = ti0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i21 = chat.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i21, new Object[0]), LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]));
                } else {
                    user = chat;
                }
            } else {
                format = LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]);
            }
            str = format;
            user = chat;
            if (user == null) {
                b5Var.b(user, null, str, i9 != ti0Var.F - 1);
                return;
            }
            return;
        }
        user = ti0Var.getMessagesController().getUser(Long.valueOf(dialogId));
        str = null;
        if (user == null) {
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // f2.r0
    public final f2.q1 x(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
