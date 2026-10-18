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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ui0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ wi0 d;

    public ui0(wi0 wi0Var, Context context) {
        this.d = wi0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f == 0) {
            return ((org.telegram.ui.Cells.a5) b1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Q;
    }

    @Override // s4.g0
    public final int j(int i10) {
        wi0 wi0Var = this.d;
        if (wi0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == wi0Var.H || i10 == wi0Var.O) {
            return 2;
        }
        if (i10 == wi0Var.K) {
            return 3;
        }
        if (i10 == wi0Var.L) {
            return 4;
        }
        if (i10 == wi0Var.N) {
            return 5;
        }
        if (i10 == wi0Var.P) {
            return 6;
        }
        return i10 == wi0Var.M ? 7 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String format;
        TLRPC.User user;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = b1Var.f;
        View view = b1Var.a;
        int i16 = 2;
        wi0 wi0Var = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int i17 = wi0Var.I;
            MessageObject messageObject = (i10 < i17 || i10 >= wi0Var.J) ? null : (MessageObject) wi0Var.x.get(i10 - i17);
            long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            if (messageObject.isStory()) {
                TLObject user2 = DialogObject.isUserDialog(dialogId) ? wi0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : wi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                a5Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != wi0Var.J - 1);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                ef0 ef0Var = new ef0(i16, this, messageObject);
                a5Var.r = storyItem;
                a5Var.a.setOnClickListener(ef0Var);
                return;
            }
            a5Var.r = null;
            a5Var.a.setOnClickListener(null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = wi0Var.getMessagesController().getUser(Long.valueOf(dialogId));
                str = null;
            } else {
                TLRPC.Chat chat = wi0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    int i18 = chat.participants_count;
                    if (i18 != 0) {
                        format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i18, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                    } else {
                        str = null;
                        user = chat;
                    }
                } else {
                    format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                }
                str = format;
                user = chat;
            }
            if (user != null) {
                a5Var.b(user, null, str, i10 != wi0Var.J - 1);
                return;
            }
            return;
        }
        if (i15 == 1) {
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            return;
        }
        if (i15 == 2) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == wi0Var.O) {
                l4Var.setTopMargin(9);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                l4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                return;
            } else {
                l4Var.setTopMargin(11);
                l4Var.setPadding(0, 0, 0, 0);
                l4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
        }
        if (i15 == 4) {
            b91 b91Var = (b91) view;
            b91Var.e(wi0Var.r, false);
            b91Var.setLayoutParams(new s4.o0(-1, -2));
            return;
        }
        if (i15 != 5) {
            if (i15 != 7) {
                return;
            }
            b91 b91Var2 = (b91) view;
            b91Var2.e(wi0Var.s, false);
            b91Var2.setLayoutParams(new s4.o0(-1, -2));
            return;
        }
        vi0 vi0Var = (vi0) view;
        TextView[] textViewArr = vi0Var.a;
        TextView[] textViewArr2 = vi0Var.b;
        wi0 wi0Var2 = vi0Var.c;
        o91 o91Var = wi0Var2.e0;
        MessageObject messageObject2 = wi0Var2.n;
        if (o91Var != null) {
            i13 = o91Var.d();
            i12 = o91Var.a();
            i14 = o91Var.c();
        } else {
            int i19 = messageObject2.isStory() ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
            i12 = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
            if (messageObject2.isStory()) {
                int i20 = messageObject2.storyItem.views.reactions_count;
                i13 = i19;
                i14 = i20;
            } else if (messageObject2.messageOwner.reactions != null) {
                int i21 = 0;
                for (int i22 = 0; i22 < messageObject2.messageOwner.reactions.results.size(); i22++) {
                    i21 += messageObject2.messageOwner.reactions.results.get(i22).count;
                }
                i13 = i19;
                i14 = i21;
            } else {
                i13 = i19;
                i14 = 0;
            }
        }
        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(wi0Var2.U, 0));
        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
        TLRPC.ChatFull chatFull = wi0Var2.a;
        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
        }
        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - wi0Var2.U), 0));
        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
        vi0Var.a();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // s4.g0
    public final s4.b1 x(
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
