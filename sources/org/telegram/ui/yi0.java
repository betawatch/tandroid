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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yi0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ aj0 d;

    public yi0(aj0 aj0Var, Context context) {
        this.d = aj0Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f == 0) {
            return ((org.telegram.ui.Cells.b5) l1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.N;
    }

    @Override // f2.o0
    public final int j(int i10) {
        aj0 aj0Var = this.d;
        if (aj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == aj0Var.E || i10 == aj0Var.L) {
            return 2;
        }
        if (i10 == aj0Var.H) {
            return 3;
        }
        if (i10 == aj0Var.I) {
            return 4;
        }
        if (i10 == aj0Var.K) {
            return 5;
        }
        if (i10 == aj0Var.M) {
            return 6;
        }
        return i10 == aj0Var.J ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = l1Var.f;
        View view = l1Var.a;
        int i16 = 7;
        aj0 aj0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == aj0Var.L) {
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
                q91 q91Var = (q91) view;
                q91Var.e(aj0Var.r, false);
                q91Var.setLayoutParams(new f2.w0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                q91 q91Var2 = (q91) view;
                q91Var2.e(aj0Var.s, false);
                q91Var2.setLayoutParams(new f2.w0(-1, -2));
                return;
            }
            zi0 zi0Var = (zi0) view;
            TextView[] textViewArr = zi0Var.a;
            TextView[] textViewArr2 = zi0Var.b;
            aj0 aj0Var2 = zi0Var.c;
            da1 da1Var = aj0Var2.b0;
            MessageObject messageObject = aj0Var2.n;
            if (da1Var != null) {
                i13 = da1Var.d();
                i12 = da1Var.a();
                i14 = da1Var.c();
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
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(aj0Var2.R, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = aj0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - aj0Var2.R), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            zi0Var.a();
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i21 = aj0Var.F;
        MessageObject messageObject2 = (i10 < i21 || i10 >= aj0Var.G) ? null : (MessageObject) aj0Var.x.get(i10 - i21);
        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
        if (messageObject2.isStory()) {
            TLObject user2 = DialogObject.isUserDialog(dialogId) ? aj0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : aj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            TL_stories.StoryViews storyViews = messageObject2.storyItem.views;
            b5Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != aj0Var.G - 1);
            TL_stories.StoryItem storyItem = messageObject2.storyItem;
            gb0 gb0Var = new gb0(i16, this, messageObject2);
            b5Var.r = storyItem;
            b5Var.a.setOnClickListener(gb0Var);
            return;
        }
        b5Var.r = null;
        b5Var.a.setOnClickListener(null);
        if (!DialogObject.isUserDialog(dialogId)) {
            TLRPC.Chat chat = aj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
                b5Var.b(user, null, str, i10 != aj0Var.G - 1);
                return;
            }
            return;
        }
        user = aj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
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
    @Override // f2.o0
    public final f2.l1 x(
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
