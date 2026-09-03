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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zi0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ bj0 d;

    public zi0(bj0 bj0Var, Context context) {
        this.d = bj0Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f == 0) {
            return ((org.telegram.ui.Cells.b5) m1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.N;
    }

    @Override // f2.p0
    public final int j(int i10) {
        bj0 bj0Var = this.d;
        if (bj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == bj0Var.E || i10 == bj0Var.L) {
            return 2;
        }
        if (i10 == bj0Var.H) {
            return 3;
        }
        if (i10 == bj0Var.I) {
            return 4;
        }
        if (i10 == bj0Var.K) {
            return 5;
        }
        if (i10 == bj0Var.M) {
            return 6;
        }
        return i10 == bj0Var.J ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = m1Var.f;
        View view = m1Var.a;
        int i16 = 7;
        bj0 bj0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == bj0Var.L) {
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
            if (i15 == 4) {
                x91 x91Var = (x91) view;
                x91Var.e(bj0Var.r, false);
                x91Var.setLayoutParams(new f2.x0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                x91 x91Var2 = (x91) view;
                x91Var2.e(bj0Var.s, false);
                x91Var2.setLayoutParams(new f2.x0(-1, -2));
                return;
            }
            aj0 aj0Var = (aj0) view;
            TextView[] textViewArr = aj0Var.a;
            TextView[] textViewArr2 = aj0Var.b;
            bj0 bj0Var2 = aj0Var.c;
            ka1 ka1Var = bj0Var2.b0;
            MessageObject messageObject = bj0Var2.n;
            if (ka1Var != null) {
                i13 = ka1Var.d();
                i12 = ka1Var.a();
                i14 = ka1Var.c();
            } else {
                int i17 = messageObject.isStory() ? messageObject.storyItem.views.views_count : messageObject.messageOwner.views;
                i12 = messageObject.isStory() ? messageObject.storyItem.views.forwards_count : messageObject.messageOwner.forwards;
                if (messageObject.isStory()) {
                    int i18 = messageObject.storyItem.views.reactions_count;
                    i13 = i17;
                    i14 = i18;
                } else if (messageObject.messageOwner.reactions != null) {
                    int i19 = 0;
                    for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                        i19 += messageObject.messageOwner.reactions.results.get(i20).count;
                    }
                    i13 = i17;
                    i14 = i19;
                } else {
                    i13 = i17;
                    i14 = 0;
                }
            }
            textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
            textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(bj0Var2.R, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = bj0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - bj0Var2.R), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            aj0Var.a();
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i21 = bj0Var.F;
        MessageObject messageObject2 = (i10 < i21 || i10 >= bj0Var.G) ? null : (MessageObject) bj0Var.x.get(i10 - i21);
        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
        if (messageObject2.isStory()) {
            TLObject user2 = DialogObject.isUserDialog(dialogId) ? bj0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : bj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            TL_stories.StoryViews storyViews = messageObject2.storyItem.views;
            b5Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != bj0Var.G - 1);
            TL_stories.StoryItem storyItem = messageObject2.storyItem;
            hb0 hb0Var = new hb0(i16, this, messageObject2);
            b5Var.r = storyItem;
            b5Var.a.setOnClickListener(hb0Var);
            return;
        }
        b5Var.r = null;
        b5Var.a.setOnClickListener(null);
        if (!DialogObject.isUserDialog(dialogId)) {
            TLRPC.Chat chat = bj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i22 = chat.participants_count;
                if (i22 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i22, new Object[0]), LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]));
                } else {
                    user = chat;
                }
            } else {
                format = LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]);
            }
            str = format;
            user = chat;
            if (user == null) {
                b5Var.b(user, null, str, i10 != bj0Var.G - 1);
                return;
            }
            return;
        }
        user = bj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
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
    @Override // f2.p0
    public final f2.m1 x(
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
