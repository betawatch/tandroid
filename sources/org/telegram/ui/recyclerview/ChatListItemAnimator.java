package org.telegram.ui.recyclerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.UserInfoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.TextMessageEnterTransition;
import org.telegram.ui.VoiceMessageEnterTransition;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

/* loaded from: classes3.dex */
public abstract class ChatListItemAnimator extends DefaultItemAnimator {
    public static final Interpolator DEFAULT_INTERPOLATOR = new CubicBezierInterpolator(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    private final ChatActivity activity;
    long alphaEnterDelay;
    private ChatGreetingsView chatGreetingsView;
    private Utilities.Callback0Return getThanosEffectContainer;
    private RecyclerView.ViewHolder greetingsSticker;
    private final RecyclerListView recyclerListView;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean reversePositions;
    private boolean shouldAnimateEnterFromBottom;
    private Utilities.Callback0Return supportsThanosEffectContainer;
    private HashMap willRemovedGroup = new HashMap();
    private ArrayList willChangedGroups = new ArrayList();
    HashMap animators = new HashMap();
    ArrayList thanosViews = new ArrayList();
    ArrayList runOnAnimationsEnd = new ArrayList();
    HashMap groupIdToEnterDelay = new HashMap();
    private final ArrayList toBeSnapped = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public long getChangeDuration() {
        return 250L;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator
    protected long getMoveAnimationDelay() {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public long getMoveDuration() {
        return 250L;
    }

    public void onAnimationStart() {
    }

    public ChatListItemAnimator(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.activity = chatActivity;
        this.recyclerListView = recyclerListView;
        this.translationInterpolator = DEFAULT_INTERPOLATOR;
        this.alwaysCreateMoveAnimationIfPossible = true;
        setSupportsChangeAnimations(false);
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        int i;
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z = false;
        if (this.shouldAnimateEnterFromBottom) {
            boolean z2 = false;
            while (i < this.mPendingAdditions.size()) {
                if (this.reversePositions) {
                    i = ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).getLayoutPosition() != (this.recyclerListView.getAdapter() == null ? 0 : this.recyclerListView.getAdapter().getItemCount()) - 1 ? i + 1 : 0;
                    z2 = true;
                } else {
                    if (((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).getLayoutPosition() != 0) {
                    }
                    z2 = true;
                }
            }
            z = z2;
        }
        onAnimationStart();
        if (z) {
            runMessageEnterTransition();
        } else {
            runAlphaEnterTransition();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatListItemAnimator.$r8$lambda$LpqfvZEIIMt3c0FpRUsyJL8QNnw(ChatListItemAnimator.this, valueAnimator);
            }
        });
        ofFloat.setDuration(getRemoveDuration() + getMoveDuration());
        ofFloat.start();
    }

    public static /* synthetic */ void $r8$lambda$LpqfvZEIIMt3c0FpRUsyJL8QNnw(ChatListItemAnimator chatListItemAnimator, ValueAnimator valueAnimator) {
        ChatActivity chatActivity = chatListItemAnimator.activity;
        if (chatActivity != null) {
            chatActivity.onListItemAnimatorTick();
        } else {
            chatListItemAnimator.recyclerListView.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void runAlphaEnterTransition() {
        final boolean z;
        int size;
        int i;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject messageObject;
        Utilities.Callback0Return callback0Return;
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        int i2 = 0;
        boolean z2 = (this.getThanosEffectContainer == null || (callback0Return = this.supportsThanosEffectContainer) == null || !((Boolean) callback0Return.run()).booleanValue()) ? false : true;
        if (z2) {
            LongSparseArray longSparseArray = null;
            int i3 = 0;
            while (i3 < this.mPendingRemovals.size()) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mPendingRemovals.get(i3);
                if (this.toBeSnapped.contains(viewHolder)) {
                    View view = viewHolder.itemView;
                    if ((view instanceof ChatMessageCell) && ((ChatMessageCell) view).getCurrentMessagesGroup() != null && (messageObject = ((ChatMessageCell) viewHolder.itemView).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                        if (longSparseArray == null) {
                            longSparseArray = new LongSparseArray();
                        }
                        ArrayList arrayList = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                        if (arrayList == null) {
                            long groupId = messageObject.getGroupId();
                            ArrayList arrayList2 = new ArrayList();
                            longSparseArray.put(groupId, arrayList2);
                            arrayList = arrayList2;
                        }
                        this.toBeSnapped.remove(viewHolder);
                        this.mPendingRemovals.remove(i3);
                        i3--;
                        arrayList.add(viewHolder);
                    }
                }
                i3++;
            }
            if (longSparseArray != null) {
                z = false;
                for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
                    ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i4);
                    if (arrayList3.size() > 0) {
                        View view2 = ((RecyclerView.ViewHolder) arrayList3.get(0)).itemView;
                        if ((view2 instanceof ChatMessageCell) && (currentMessagesGroup = ((ChatMessageCell) view2).getCurrentMessagesGroup()) != null && currentMessagesGroup.messages.size() > arrayList3.size()) {
                            this.mPendingRemovals.addAll(arrayList3);
                        } else {
                            animateRemoveGroupImpl(arrayList3);
                            z = true;
                        }
                    }
                }
                ArrayList arrayList4 = this.mPendingRemovals;
                size = arrayList4.size();
                i = 0;
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) obj;
                    boolean z3 = this.toBeSnapped.remove(viewHolder2) && z2;
                    animateRemoveImpl(viewHolder2, z3);
                    if (z3) {
                        z = true;
                    }
                }
                this.mPendingRemovals.clear();
                if (!isEmpty2) {
                    final ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(this.mPendingMoves);
                    this.mMovesList.add(arrayList5);
                    this.mPendingMoves.clear();
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ArrayList arrayList6 = arrayList5;
                            int size2 = arrayList6.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj2 = arrayList6.get(i5);
                                i5++;
                                DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) obj2;
                                ChatListItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo, z);
                            }
                            arrayList5.clear();
                            ((DefaultItemAnimator) ChatListItemAnimator.this).mMovesList.remove(arrayList5);
                        }
                    };
                    if (this.delayAnimations && !isEmpty) {
                        ViewCompat.postOnAnimationDelayed(((DefaultItemAnimator.MoveInfo) arrayList5.get(0)).holder.itemView, runnable, z ? 0L : getMoveAnimationDelay());
                    } else {
                        runnable.run();
                    }
                }
                if (!isEmpty3) {
                    final ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(this.mPendingChanges);
                    this.mChangesList.add(arrayList6);
                    this.mPendingChanges.clear();
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ArrayList arrayList7 = arrayList6;
                            int size2 = arrayList7.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj2 = arrayList7.get(i5);
                                i5++;
                                ChatListItemAnimator.this.animateChangeImpl((DefaultItemAnimator.ChangeInfo) obj2);
                            }
                            arrayList6.clear();
                            ((DefaultItemAnimator) ChatListItemAnimator.this).mChangesList.remove(arrayList6);
                        }
                    };
                    if (this.delayAnimations && !isEmpty) {
                        ViewCompat.postOnAnimationDelayed(((DefaultItemAnimator.ChangeInfo) arrayList6.get(0)).oldHolder.itemView, runnable2, 0L);
                    } else {
                        runnable2.run();
                    }
                }
                if (isEmpty4) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(this.mPendingAdditions);
                    this.mPendingAdditions.clear();
                    this.alphaEnterDelay = 0L;
                    Collections.sort(arrayList7, new Comparator() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda7
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return ChatListItemAnimator.$r8$lambda$0NLHKLzBmhjCgAIUOnunghuiOhE((RecyclerView.ViewHolder) obj2, (RecyclerView.ViewHolder) obj3);
                        }
                    });
                    int size2 = arrayList7.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList7.get(i2);
                        i2++;
                        animateAddImpl((RecyclerView.ViewHolder) obj2);
                    }
                    arrayList7.clear();
                    return;
                }
                return;
            }
        }
        z = false;
        ArrayList arrayList42 = this.mPendingRemovals;
        size = arrayList42.size();
        i = 0;
        while (i < size) {
        }
        this.mPendingRemovals.clear();
        if (!isEmpty2) {
        }
        if (!isEmpty3) {
        }
        if (isEmpty4) {
        }
    }

    public static /* synthetic */ int $r8$lambda$0NLHKLzBmhjCgAIUOnunghuiOhE(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return viewHolder2.itemView.getTop() - viewHolder.itemView.getTop();
    }

    private void runMessageEnterTransition() {
        int i;
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.mPendingAdditions.size()) {
            View view = ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).itemView;
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                i = (chatMessageCell.getCurrentPosition() != null && (chatMessageCell.getCurrentPosition().flags & 1) == 0) ? i + 1 : 0;
            }
            i3 += ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).itemView.getHeight();
        }
        ArrayList arrayList = this.mPendingRemovals;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            animateRemoveImpl((RecyclerView.ViewHolder) obj);
        }
        this.mPendingRemovals.clear();
        if (!isEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.mPendingMoves);
            this.mPendingMoves.clear();
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) obj2;
                animateMoveImpl(moveInfo.holder, moveInfo);
            }
            arrayList2.clear();
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.mPendingAdditions);
        this.mPendingAdditions.clear();
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            animateAddImpl((RecyclerView.ViewHolder) obj3, i3);
        }
        arrayList3.clear();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        boolean animateAppearance = super.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        if (animateAppearance && this.shouldAnimateEnterFromBottom) {
            boolean z = false;
            for (int i2 = 0; i2 < this.mPendingAdditions.size(); i2++) {
                if (((RecyclerView.ViewHolder) this.mPendingAdditions.get(i2)).getLayoutPosition() == 0) {
                    z = true;
                }
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < this.mPendingAdditions.size(); i3++) {
                    i += ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i3)).itemView.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < this.mPendingAdditions.size(); i4++) {
                ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i4)).itemView.setTranslationY(i);
            }
        }
        return animateAppearance;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        if (!this.shouldAnimateEnterFromBottom) {
            viewHolder.itemView.setScaleX(0.9f);
            viewHolder.itemView.setScaleY(0.9f);
        } else {
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).getTransitionParams().messageEntering = true;
            }
        }
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    public void animateAddImpl(final RecyclerView.ViewHolder viewHolder, int i) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(viewHolder);
        view.setTranslationY(i);
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        View view2 = viewHolder.itemView;
        ChatMessageCell chatMessageCell = view2 instanceof ChatMessageCell ? (ChatMessageCell) view2 : null;
        if (chatMessageCell == null || !chatMessageCell.getTransitionParams().ignoreAlpha) {
            viewHolder.itemView.setAlpha(1.0f);
        }
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null && chatMessageCell != null && chatActivity.animatingMessageObjects.contains(chatMessageCell.getMessageObject())) {
            this.activity.animatingMessageObjects.remove(chatMessageCell.getMessageObject());
            if (this.activity.getChatActivityEnterView().canShowMessageTransition()) {
                if (chatMessageCell.getMessageObject().isVoice()) {
                    if (Math.abs(view.getTranslationY()) < view.getMeasuredHeight() * 3.0f) {
                        new VoiceMessageEnterTransition(chatMessageCell, this.activity.getChatActivityEnterView(), this.recyclerListView, this.activity.messageEnterTransitionContainer, this.resourcesProvider).start();
                    }
                } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view.getTranslationY()) < this.recyclerListView.getMeasuredHeight()) {
                    ChatActivity chatActivity2 = this.activity;
                    new TextMessageEnterTransition(chatMessageCell, chatActivity2, this.recyclerListView, chatActivity2.messageEnterTransitionContainer, this.resourcesProvider).start();
                }
                this.activity.getChatActivityEnterView().startMessageTransition();
            }
        }
        animate.translationY(0.0f).setDuration(getMoveDuration()).setInterpolator(this.translationInterpolator).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                view.setTranslationY(0.0f);
                View view3 = view;
                if (view3 instanceof ChatMessageCell) {
                    ((ChatMessageCell) view3).getTransitionParams().messageEntering = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view3 = view;
                if (view3 instanceof ChatMessageCell) {
                    ((ChatMessageCell) view3).getTransitionParams().messageEntering = false;
                }
                animate.setListener(null);
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        boolean animateRemove = super.animateRemove(viewHolder, itemHolderInfo);
        if (animateRemove && itemHolderInfo != null) {
            int i = itemHolderInfo.top;
            int top = viewHolder.itemView.getTop();
            int left = viewHolder.itemView.getLeft() - itemHolderInfo.left;
            if (top - i != 0) {
                viewHolder.itemView.setTranslationY(-r2);
            }
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                if (left != 0) {
                    chatMessageCell.setAnimationOffsetX(-left);
                }
                if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                    ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                    chatMessageCell.setImageCoords(itemHolderInfoExtended.imageX, itemHolderInfoExtended.imageY, itemHolderInfoExtended.imageWidth, itemHolderInfoExtended.imageHeight);
                    return animateRemove;
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
        return animateRemove;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        int translationX;
        int i5;
        ChatMessageCell chatMessageCell;
        ChatActionCell chatActionCell;
        float f;
        float f2;
        float f3;
        float f4;
        ChatMessageCell chatMessageCell2;
        boolean z;
        float f5;
        MessageObject.GroupedMessages groupedMessages;
        ChatMessageCell chatMessageCell3;
        View view = viewHolder.itemView;
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell4 = (ChatMessageCell) view;
            translationX = i + ((int) chatMessageCell4.getAnimationOffsetX());
            i5 = chatMessageCell4.getTransitionParams().lastTopOffset != chatMessageCell4.getTopMediaOffset() ? i2 + (chatMessageCell4.getTransitionParams().lastTopOffset - chatMessageCell4.getTopMediaOffset()) : i2;
            chatMessageCell = chatMessageCell4;
            chatActionCell = null;
        } else if (view instanceof ChatActionCell) {
            translationX = i + ((int) view.getTranslationX());
            i5 = i2;
            chatActionCell = (ChatActionCell) view;
            chatMessageCell = null;
        } else {
            translationX = i + ((int) view.getTranslationX());
            i5 = i2;
            chatMessageCell = null;
            chatActionCell = null;
        }
        int translationY = i5 + ((int) viewHolder.itemView.getTranslationY());
        int[] iArr = new int[4];
        if (chatMessageCell != null) {
            float imageX = chatMessageCell.getPhotoImage().getImageX();
            f = chatMessageCell.getPhotoImage().getImageY();
            f2 = chatMessageCell.getPhotoImage().getImageWidth();
            f3 = chatMessageCell.getPhotoImage().getImageHeight();
            for (int i6 = 0; i6 < 4; i6++) {
                iArr[i6] = chatMessageCell.getPhotoImage().getRoundRadius()[i6];
            }
            f4 = imageX;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        resetAnimation(viewHolder);
        int i7 = i3 - translationX;
        int i8 = i4 - translationY;
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        float f6 = f2;
        float f7 = f3;
        float f8 = f;
        MoveInfoExtended moveInfoExtended = new MoveInfoExtended(viewHolder, translationX, translationY, i3, i4);
        if (chatMessageCell != null) {
            ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
            if (!transitionParams.supportChangeAnimation()) {
                if (i7 == 0 && i8 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i7 != 0) {
                    view.setTranslationX(-i7);
                }
                this.mPendingMoves.add(moveInfoExtended);
                checkIsRunning();
                return true;
            }
            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (i7 != 0) {
                chatMessageCell.setAnimationOffsetX(-i7);
            }
            if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                boolean z2 = (!transitionParams.wasDraw || itemHolderInfoExtended.imageHeight == 0.0f || itemHolderInfoExtended.imageWidth == 0.0f) ? false : true;
                moveInfoExtended.animateImage = z2;
                if (z2) {
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    transitionParams.imageChangeBoundsTransition = true;
                    if (chatMessageCell.getMessageObject().isRoundVideo()) {
                        transitionParams.animateToImageX = f4;
                        transitionParams.animateToImageY = f8;
                        transitionParams.animateToImageW = f6;
                        transitionParams.animateToImageH = f7;
                        transitionParams.animateToRadius = iArr;
                    } else {
                        transitionParams.animateToImageX = photoImage.getImageX();
                        transitionParams.animateToImageY = photoImage.getImageY();
                        transitionParams.animateToImageW = photoImage.getImageWidth();
                        transitionParams.animateToImageH = photoImage.getImageHeight();
                        transitionParams.animateToRadius = photoImage.getRoundRadius();
                    }
                    transitionParams.animateRadius = false;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= 4) {
                            break;
                        }
                        if (transitionParams.imageRoundRadius[i9] != transitionParams.animateToRadius[i9]) {
                            transitionParams.animateRadius = true;
                            break;
                        }
                        i9++;
                    }
                    float f9 = transitionParams.animateToImageX;
                    float f10 = itemHolderInfoExtended.imageX;
                    if (f9 == f10 && transitionParams.animateToImageY == itemHolderInfoExtended.imageY && transitionParams.animateToImageH == itemHolderInfoExtended.imageHeight && transitionParams.animateToImageW == itemHolderInfoExtended.imageWidth && !transitionParams.animateRadius) {
                        transitionParams.imageChangeBoundsTransition = false;
                        moveInfoExtended.animateImage = false;
                    } else {
                        moveInfoExtended.imageX = f10;
                        moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                        moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                        moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                        if (currentMessagesGroup != null) {
                            boolean z3 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z4 = transitionParams2.drawCaptionLayout;
                            if (z3 != z4) {
                                transitionParams2.captionEnterProgress = z4 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.animateRadius) {
                            if (transitionParams.animateToRadius == photoImage.getRoundRadius()) {
                                transitionParams.animateToRadius = new int[4];
                                for (int i10 = 0; i10 < 4; i10++) {
                                    transitionParams.animateToRadius[i10] = photoImage.getRoundRadius()[i10];
                                }
                            }
                            photoImage.setRoundRadius(transitionParams.imageRoundRadius);
                        }
                        chatMessageCell.setImageCoords(moveInfoExtended.imageX, moveInfoExtended.imageY, moveInfoExtended.imageWidth, moveInfoExtended.imageHeight);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.wasDraw) {
                    boolean isOutOwner = chatMessageCell.getMessageObject().isOutOwner();
                    boolean z5 = (isOutOwner && transitionParams.lastDrawingBackgroundRect.left != chatMessageCell.getBackgroundDrawableLeft()) || !(isOutOwner || transitionParams.lastDrawingBackgroundRect.right == chatMessageCell.getBackgroundDrawableRight());
                    if (z5 || transitionParams.lastDrawingBackgroundRect.top != chatMessageCell.getBackgroundDrawableTop() || transitionParams.lastDrawingBackgroundRect.bottom != chatMessageCell.getBackgroundDrawableBottom()) {
                        moveInfoExtended.deltaBottom = chatMessageCell.getBackgroundDrawableBottom() - transitionParams.lastDrawingBackgroundRect.bottom;
                        moveInfoExtended.deltaTop = chatMessageCell.getBackgroundDrawableTop() - transitionParams.lastDrawingBackgroundRect.top;
                        if (chatMessageCell.isSideMenuEnabled != transitionParams.lastDrawingSideMenuEnabled) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams.lastDrawingBackgroundRect.left;
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams.lastDrawingBackgroundRect.right;
                        } else if (isOutOwner) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams.lastDrawingBackgroundRect.left;
                        } else {
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams.lastDrawingBackgroundRect.right;
                        }
                        moveInfoExtended.animateBackgroundOnly = true;
                        transitionParams.animateBackgroundBoundsInner = true;
                        transitionParams.animateBackgroundWidth = z5;
                        transitionParams.deltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams.deltaRight = -moveInfoExtended.deltaRight;
                        transitionParams.deltaTop = -moveInfoExtended.deltaTop;
                        transitionParams.deltaBottom = -moveInfoExtended.deltaBottom;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                    }
                }
            }
            if (currentMessagesGroup == null || !this.willChangedGroups.contains(currentMessagesGroup)) {
                chatMessageCell2 = chatMessageCell;
            } else {
                this.willChangedGroups.remove(currentMessagesGroup);
                RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z6 = true;
                while (i11 < recyclerListView.getChildCount()) {
                    View childAt = recyclerListView.getChildAt(i11);
                    int i16 = i11;
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell5 = (ChatMessageCell) childAt;
                        if (chatMessageCell5.getCurrentMessagesGroup() == currentMessagesGroup && !chatMessageCell5.getMessageObject().deleted) {
                            int left = chatMessageCell5.getLeft() + chatMessageCell5.getBackgroundDrawableLeft();
                            int left2 = chatMessageCell5.getLeft() + chatMessageCell5.getBackgroundDrawableRight();
                            groupedMessages = currentMessagesGroup;
                            int top = chatMessageCell5.getTop() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getBackgroundDrawableTop();
                            chatMessageCell3 = chatMessageCell;
                            int top2 = chatMessageCell5.getTop() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getBackgroundDrawableBottom();
                            if (i14 == 0 || left < i14) {
                                i14 = left;
                            }
                            if (i15 == 0 || left2 > i15) {
                                i15 = left2;
                            }
                            if (chatMessageCell5.getTransitionParams().wasDraw || transitionParams3.isNewGroup) {
                                if (i12 == 0 || top < i12) {
                                    i12 = top;
                                }
                                if (i13 == 0 || top2 > i13) {
                                    i13 = top2;
                                }
                                z6 = false;
                            }
                            i11 = i16 + 1;
                            currentMessagesGroup = groupedMessages;
                            chatMessageCell = chatMessageCell3;
                        }
                    }
                    groupedMessages = currentMessagesGroup;
                    chatMessageCell3 = chatMessageCell;
                    i11 = i16 + 1;
                    currentMessagesGroup = groupedMessages;
                    chatMessageCell = chatMessageCell3;
                }
                chatMessageCell2 = chatMessageCell;
                transitionParams3.isNewGroup = false;
                if (i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) {
                    moveInfoExtended.animateChangeGroupBackground = false;
                    transitionParams3.backgroundChangeBounds = false;
                } else {
                    int i17 = (-i12) + transitionParams3.top;
                    moveInfoExtended.groupOffsetTop = i17;
                    int i18 = (-i13) + transitionParams3.bottom;
                    moveInfoExtended.groupOffsetBottom = i18;
                    int i19 = (-i14) + transitionParams3.left;
                    moveInfoExtended.groupOffsetLeft = i19;
                    int i20 = (-i15) + transitionParams3.right;
                    moveInfoExtended.groupOffsetRight = i20;
                    moveInfoExtended.animateChangeGroupBackground = true;
                    transitionParams3.backgroundChangeBounds = true;
                    transitionParams3.offsetTop = i17;
                    transitionParams3.offsetBottom = i18;
                    transitionParams3.offsetLeft = i19;
                    transitionParams3.offsetRight = i20;
                    transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                    recyclerListView.setClipChildren(false);
                    recyclerListView.invalidate();
                }
                transitionParams3.drawBackgroundForDeletedItems = z6;
            }
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) this.willRemovedGroup.get(Integer.valueOf(chatMessageCell2.getMessageObject().getId()));
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                this.willRemovedGroup.remove(Integer.valueOf(chatMessageCell2.getMessageObject().getId()));
                if (transitionParams.wasDraw) {
                    int left3 = chatMessageCell2.getLeft() + chatMessageCell2.getBackgroundDrawableLeft();
                    int left4 = chatMessageCell2.getLeft() + chatMessageCell2.getBackgroundDrawableRight();
                    int top3 = chatMessageCell2.getTop() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableTop();
                    int top4 = chatMessageCell2.getTop() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableBottom();
                    moveInfoExtended.animateRemoveGroup = true;
                    transitionParams.animateBackgroundBoundsInner = true;
                    moveInfoExtended.deltaLeft = left3 - transitionParams4.left;
                    moveInfoExtended.deltaRight = left4 - transitionParams4.right;
                    moveInfoExtended.deltaTop = top3 - transitionParams4.top;
                    moveInfoExtended.deltaBottom = top4 - transitionParams4.bottom;
                    moveInfoExtended.animateBackgroundOnly = false;
                    transitionParams.deltaLeft = (int) ((-r5) - chatMessageCell2.getAnimationOffsetX());
                    transitionParams.deltaRight = (int) ((-moveInfoExtended.deltaRight) - chatMessageCell2.getAnimationOffsetX());
                    transitionParams.deltaTop = (int) ((-moveInfoExtended.deltaTop) - chatMessageCell2.getTranslationY());
                    transitionParams.deltaBottom = (int) ((-moveInfoExtended.deltaBottom) - chatMessageCell2.getTranslationY());
                    z = true;
                    transitionParams.transformGroupToSingleMessage = true;
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                } else {
                    z = true;
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            } else {
                z = true;
            }
            if (transitionParams.drawPinnedBottomBackground != chatMessageCell2.isDrawPinnedBottom()) {
                moveInfoExtended.animatePinnedBottom = z;
                f5 = 0.0f;
                transitionParams.changePinnedBottomProgress = 0.0f;
            } else {
                f5 = 0.0f;
            }
            boolean animateChange = transitionParams.animateChange();
            moveInfoExtended.animateChangeInternal = animateChange;
            if (animateChange) {
                transitionParams.animateChange = z;
                transitionParams.animateChangeProgress = f5;
            }
            if (i7 == 0 && i8 == 0 && !moveInfoExtended.animateImage && !moveInfoExtended.animateRemoveGroup && !moveInfoExtended.animateChangeGroupBackground && !moveInfoExtended.animatePinnedBottom && !moveInfoExtended.animateBackgroundOnly && !animateChange) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else if (chatActionCell != null) {
            ChatActionCell.TransitionParams transitionParams5 = chatActionCell.getTransitionParams();
            if (!transitionParams5.supportChangeAnimation()) {
                if (i7 == 0 && i8 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i7 != 0) {
                    view.setTranslationX(-i7);
                }
                this.mPendingMoves.add(moveInfoExtended);
                checkIsRunning();
                return true;
            }
            if (i7 != 0) {
                view.setTranslationX(-i7);
            }
            boolean animateChange2 = transitionParams5.animateChange();
            moveInfoExtended.animateChangeInternal = animateChange2;
            if (animateChange2) {
                transitionParams5.animateChange = true;
                transitionParams5.animateChangeProgress = 0.0f;
            }
            if (i7 == 0 && i8 == 0 && !animateChange2) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else {
            View view2 = viewHolder.itemView;
            if (view2 instanceof BotHelpCell) {
                ((BotHelpCell) view2).setAnimating(true);
            } else if (view2 instanceof UserInfoCell) {
                ((UserInfoCell) view2).setAnimating(true);
            } else {
                if (i7 == 0 && i8 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i7 != 0) {
                    view.setTranslationX(-i7);
                }
            }
        }
        this.mPendingMoves.add(moveInfoExtended);
        checkIsRunning();
        return true;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator
    protected void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
        animateMoveImpl(viewHolder, moveInfo, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void animateMoveImpl(final RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo, boolean z) {
        final MoveInfoExtended moveInfoExtended;
        float f;
        boolean z2;
        ValueAnimator valueAnimator;
        final boolean z3;
        char c;
        int[] iArr;
        int i = moveInfo.fromX;
        int i2 = moveInfo.fromY;
        int i3 = moveInfo.toY;
        final View view = viewHolder.itemView;
        final int i4 = i3 - i2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (i4 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.mMoveAnimations.add(viewHolder);
        MoveInfoExtended moveInfoExtended2 = (MoveInfoExtended) moveInfo;
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null) {
            View view2 = viewHolder.itemView;
            if (view2 instanceof BotHelpCell) {
                final BotHelpCell botHelpCell = (BotHelpCell) view2;
                final float translationY = botHelpCell.getTranslationY();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        float measuredHeight = ((((ChatListItemAnimator.this.recyclerListView.getMeasuredHeight() - ChatListItemAnimator.this.activity.getChatListViewPadding()) - ChatListItemAnimator.this.activity.blurredViewBottomOffset) / 2.0f) - (botHelpCell.getMeasuredHeight() / 2.0f)) + ChatListItemAnimator.this.activity.getChatListViewPadding();
                        botHelpCell.setTranslationY((translationY * (1.0f - floatValue)) + ((((float) botHelpCell.getTop()) > measuredHeight ? measuredHeight - botHelpCell.getTop() : 0.0f) * floatValue));
                    }
                });
                animatorSet.playTogether(ofFloat);
                if (z) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                } else {
                    Interpolator interpolator = this.translationInterpolator;
                    if (interpolator != null) {
                        animatorSet.setInterpolator(interpolator);
                    }
                }
                animatorSet.setDuration((long) (getMoveDuration() * (z ? 1.9f : 1.0f)));
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ChatListItemAnimator.this.dispatchMoveStarting(viewHolder);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        if (i4 != 0) {
                            view.setTranslationY(0.0f);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        animator.removeAllListeners();
                        ChatListItemAnimator.this.restoreTransitionParams(viewHolder.itemView);
                        View view3 = viewHolder.itemView;
                        if (view3 instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) view3;
                            if (chatMessageCell.makeVisibleAfterChange) {
                                chatMessageCell.makeVisibleAfterChange = false;
                                chatMessageCell.setVisibility(0);
                            }
                            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                            if (currentMessagesGroup != null) {
                                currentMessagesGroup.transitionParams.reset();
                            }
                        }
                        if (((DefaultItemAnimator) ChatListItemAnimator.this).mMoveAnimations.remove(viewHolder)) {
                            ChatListItemAnimator.this.dispatchMoveFinished(viewHolder);
                            ChatListItemAnimator.this.dispatchFinishedWhenDone();
                        }
                    }
                });
                animatorSet.start();
                this.animators.put(viewHolder, animatorSet);
            }
        }
        if (chatActivity != null) {
            View view3 = viewHolder.itemView;
            if (view3 instanceof UserInfoCell) {
                final UserInfoCell userInfoCell = (UserInfoCell) view3;
                final float translationY2 = userInfoCell.getTranslationY();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        float measuredHeight = ((((ChatListItemAnimator.this.recyclerListView.getMeasuredHeight() - ChatListItemAnimator.this.activity.getChatListViewPadding()) - ChatListItemAnimator.this.activity.blurredViewBottomOffset) / 2.0f) - (userInfoCell.getMeasuredHeight() / 2.0f)) + ChatListItemAnimator.this.activity.getChatListViewPadding();
                        userInfoCell.setTranslationY((translationY2 * (1.0f - floatValue)) + ((((float) userInfoCell.getTop()) > measuredHeight ? measuredHeight - userInfoCell.getTop() : 0.0f) * floatValue));
                    }
                });
                animatorSet.playTogether(ofFloat2);
                if (z) {
                }
                animatorSet.setDuration((long) (getMoveDuration() * (z ? 1.9f : 1.0f)));
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ChatListItemAnimator.this.dispatchMoveStarting(viewHolder);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        if (i4 != 0) {
                            view.setTranslationY(0.0f);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        animator.removeAllListeners();
                        ChatListItemAnimator.this.restoreTransitionParams(viewHolder.itemView);
                        View view32 = viewHolder.itemView;
                        if (view32 instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) view32;
                            if (chatMessageCell.makeVisibleAfterChange) {
                                chatMessageCell.makeVisibleAfterChange = false;
                                chatMessageCell.setVisibility(0);
                            }
                            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                            if (currentMessagesGroup != null) {
                                currentMessagesGroup.transitionParams.reset();
                            }
                        }
                        if (((DefaultItemAnimator) ChatListItemAnimator.this).mMoveAnimations.remove(viewHolder)) {
                            ChatListItemAnimator.this.dispatchMoveFinished(viewHolder);
                            ChatListItemAnimator.this.dispatchFinishedWhenDone();
                        }
                    }
                });
                animatorSet.start();
                this.animators.put(viewHolder, animatorSet);
            }
        }
        View view4 = viewHolder.itemView;
        if (view4 instanceof ChatMessageCell) {
            final ChatMessageCell chatMessageCell = (ChatMessageCell) view4;
            final ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
            animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, (Property<ChatMessageCell, Float>) chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
            if (moveInfoExtended2.animateImage) {
                chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f2 = chatMessageCell.getCurrentMessagesGroup() == null ? transitionParams.captionEnterProgress : chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                final float hasCaptionLayout = chatMessageCell.getCurrentMessagesGroup() == null ? chatMessageCell.hasCaptionLayout() : chatMessageCell.getCurrentMessagesGroup().hasCaption;
                if (f2 != hasCaptionLayout) {
                    valueAnimator = ofFloat3;
                    z3 = true;
                } else {
                    valueAnimator = ofFloat3;
                    z3 = false;
                }
                if (transitionParams.animateRadius) {
                    iArr = new int[4];
                    c = 0;
                    for (int i5 = 0; i5 < 4; i5++) {
                        iArr[i5] = chatMessageCell.getPhotoImage().getRoundRadius()[i5];
                    }
                } else {
                    c = 0;
                    iArr = null;
                }
                moveInfoExtended = moveInfoExtended2;
                ValueAnimator valueAnimator2 = valueAnimator;
                final int[] iArr2 = iArr;
                f = 0.0f;
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$o-m2k4wYSnG7ii6RhLEuKuITF6s(ChatListItemAnimator.MoveInfoExtended.this, transitionParams, z3, f2, hasCaptionLayout, chatMessageCell, iArr2, viewHolder, valueAnimator3);
                    }
                });
                Animator[] animatorArr = new Animator[1];
                animatorArr[c] = valueAnimator2;
                animatorSet.playTogether(animatorArr);
            } else {
                moveInfoExtended = moveInfoExtended2;
                f = 0.0f;
            }
            if (moveInfoExtended.deltaBottom != 0 || moveInfoExtended.deltaRight != 0 || moveInfoExtended.deltaTop != 0 || moveInfoExtended.deltaLeft != 0) {
                this.recyclerListView.setClipChildren(false);
                this.recyclerListView.invalidate();
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                if (moveInfoExtended.animateBackgroundOnly) {
                    transitionParams.toDeltaLeft = -moveInfoExtended.deltaLeft;
                    transitionParams.toDeltaRight = -moveInfoExtended.deltaRight;
                } else {
                    transitionParams.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                    transitionParams.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                }
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$8W2CifkKWRLeTD6jc3A2ApMzDzg(ChatListItemAnimator.MoveInfoExtended.this, transitionParams, chatMessageCell, valueAnimator3);
                    }
                });
                z2 = false;
                animatorSet.playTogether(ofFloat4);
            } else {
                transitionParams.toDeltaLeft = f;
                transitionParams.toDeltaRight = f;
                z2 = false;
            }
            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (currentMessagesGroup == null) {
                moveInfoExtended.animateChangeGroupBackground = z2;
            }
            if (moveInfoExtended.animateChangeGroupBackground) {
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                final RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                final float f3 = currentMessagesGroup.transitionParams.captionEnterProgress;
                final float f4 = currentMessagesGroup.hasCaption ? 1.0f : 0.0f;
                final boolean z4 = f3 != f4;
                final MoveInfoExtended moveInfoExtended3 = moveInfoExtended;
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$TDignImIjC3yBCWn8ikobW4ZBn8(MessageObject.GroupedMessages.TransitionParams.this, moveInfoExtended3, z4, f3, f4, recyclerListView, valueAnimator3);
                    }
                });
                ofFloat5.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = transitionParams2;
                        transitionParams3.backgroundChangeBounds = false;
                        transitionParams3.drawBackgroundForDeletedItems = false;
                    }
                });
                animatorSet.playTogether(ofFloat5);
            }
            if (moveInfoExtended.animatePinnedBottom) {
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$OQamxP6pcjwMza4x4sJNjqcje74(ChatMessageCell.TransitionParams.this, chatMessageCell, valueAnimator3);
                    }
                });
                animatorSet.playTogether(ofFloat6);
            }
            if (moveInfoExtended.animateChangeInternal) {
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                transitionParams.animateChange = true;
                ofFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$DESw_RADR9OXg_W7WyJ2EAqETMc(ChatMessageCell.TransitionParams.this, chatMessageCell, valueAnimator3);
                    }
                });
                animatorSet.playTogether(ofFloat7);
            }
        } else if (view4 instanceof ChatActionCell) {
            final ChatActionCell chatActionCell = (ChatActionCell) view4;
            final ChatActionCell.TransitionParams transitionParams3 = chatActionCell.getTransitionParams();
            if (moveInfoExtended2.animateChangeInternal) {
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                transitionParams3.animateChange = true;
                ofFloat8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        ChatListItemAnimator.$r8$lambda$51q0GWi0ObdvhDKFihDT07qKlQQ(ChatActionCell.TransitionParams.this, chatActionCell, valueAnimator3);
                    }
                });
                animatorSet.playTogether(ofFloat8);
            }
        }
        if (z) {
        }
        animatorSet.setDuration((long) (getMoveDuration() * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchMoveStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (i4 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                ChatListItemAnimator.this.restoreTransitionParams(viewHolder.itemView);
                View view32 = viewHolder.itemView;
                if (view32 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell2 = (ChatMessageCell) view32;
                    if (chatMessageCell2.makeVisibleAfterChange) {
                        chatMessageCell2.makeVisibleAfterChange = false;
                        chatMessageCell2.setVisibility(0);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell2.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        currentMessagesGroup2.transitionParams.reset();
                    }
                }
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mMoveAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchMoveFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        });
        animatorSet.start();
        this.animators.put(viewHolder, animatorSet);
    }

    public static /* synthetic */ void $r8$lambda$o-m2k4wYSnG7ii6RhLEuKuITF6s(MoveInfoExtended moveInfoExtended, ChatMessageCell.TransitionParams transitionParams, boolean z, float f, float f2, ChatMessageCell chatMessageCell, int[] iArr, RecyclerView.ViewHolder viewHolder, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f3 = 1.0f - floatValue;
        float f4 = (moveInfoExtended.imageX * f3) + (transitionParams.animateToImageX * floatValue);
        float f5 = (moveInfoExtended.imageY * f3) + (transitionParams.animateToImageY * floatValue);
        float f6 = (moveInfoExtended.imageWidth * f3) + (transitionParams.animateToImageW * floatValue);
        float f7 = (moveInfoExtended.imageHeight * f3) + (transitionParams.animateToImageH * floatValue);
        if (z) {
            float f8 = (f * f3) + (f2 * floatValue);
            transitionParams.captionEnterProgress = f8;
            if (chatMessageCell.getCurrentMessagesGroup() != null) {
                chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f8;
            }
        }
        if (transitionParams.animateRadius) {
            int[] iArr2 = transitionParams.animateToRadius;
            chatMessageCell.getPhotoImage().setRoundRadius((int) ((iArr[0] * f3) + (iArr2[0] * floatValue)), (int) ((iArr[1] * f3) + (iArr2[1] * floatValue)), (int) ((iArr[2] * f3) + (iArr2[2] * floatValue)), (int) ((iArr[3] * f3) + (iArr2[3] * floatValue)));
        }
        chatMessageCell.setImageCoords(f4, f5, f6, f7);
        viewHolder.itemView.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$8W2CifkKWRLeTD6jc3A2ApMzDzg(MoveInfoExtended moveInfoExtended, ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (moveInfoExtended.animateBackgroundOnly) {
            transitionParams.deltaLeft = (-moveInfoExtended.deltaLeft) * floatValue;
            transitionParams.deltaRight = (-moveInfoExtended.deltaRight) * floatValue;
            transitionParams.deltaTop = (-moveInfoExtended.deltaTop) * floatValue;
            transitionParams.deltaBottom = (-moveInfoExtended.deltaBottom) * floatValue;
        } else {
            transitionParams.deltaLeft = ((-moveInfoExtended.deltaLeft) * floatValue) - chatMessageCell.getAnimationOffsetX();
            transitionParams.deltaRight = ((-moveInfoExtended.deltaRight) * floatValue) - chatMessageCell.getAnimationOffsetX();
            transitionParams.deltaTop = ((-moveInfoExtended.deltaTop) * floatValue) - chatMessageCell.getTranslationY();
            transitionParams.deltaBottom = ((-moveInfoExtended.deltaBottom) * floatValue) - chatMessageCell.getTranslationY();
        }
        chatMessageCell.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$TDignImIjC3yBCWn8ikobW4ZBn8(MessageObject.GroupedMessages.TransitionParams transitionParams, MoveInfoExtended moveInfoExtended, boolean z, float f, float f2, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        transitionParams.offsetTop = moveInfoExtended.groupOffsetTop * floatValue;
        transitionParams.offsetBottom = moveInfoExtended.groupOffsetBottom * floatValue;
        transitionParams.offsetLeft = moveInfoExtended.groupOffsetLeft * floatValue;
        transitionParams.offsetRight = moveInfoExtended.groupOffsetRight * floatValue;
        if (z) {
            transitionParams.captionEnterProgress = (f * floatValue) + (f2 * (1.0f - floatValue));
        }
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    public static /* synthetic */ void $r8$lambda$OQamxP6pcjwMza4x4sJNjqcje74(ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        transitionParams.changePinnedBottomProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$DESw_RADR9OXg_W7WyJ2EAqETMc(ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$51q0GWi0ObdvhDKFihDT07qKlQQ(ChatActionCell.TransitionParams transitionParams, ChatActionCell chatActionCell, ValueAnimator valueAnimator) {
        transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActionCell.invalidate();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        float translationX;
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, itemHolderInfo, i, i2, i3, i4);
        }
        View view = viewHolder.itemView;
        if (view instanceof ChatMessageCell) {
            translationX = ((ChatMessageCell) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        View view2 = viewHolder.itemView;
        if (view2 instanceof ChatMessageCell) {
            ((ChatMessageCell) view2).setAnimationOffsetX(translationX);
        } else {
            view2.setTranslationX(translationX);
        }
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            View view3 = viewHolder2.itemView;
            if (view3 instanceof ChatMessageCell) {
                ((ChatMessageCell) view3).setAnimationOffsetX(-i5);
            } else {
                view3.setTranslationX(-i5);
            }
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new DefaultItemAnimator.ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        checkIsRunning();
        return true;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator
    public void animateChangeImpl(final DefaultItemAnimator.ChangeInfo changeInfo) {
        RecyclerView.ViewHolder viewHolder = changeInfo.oldHolder;
        final View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = changeInfo.newHolder;
        final View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ChatListItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleX(1.0f);
                    View view3 = view;
                    if (view3 instanceof ChatMessageCell) {
                        ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                    } else {
                        view3.setTranslationX(0.0f);
                    }
                    view.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mChangeAnimations.remove(changeInfo.oldHolder)) {
                        ChatListItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(changeInfo.newHolder);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ChatListItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setScaleX(1.0f);
                    view2.setScaleX(1.0f);
                    View view3 = view2;
                    if (view3 instanceof ChatMessageCell) {
                        ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                    } else {
                        view3.setTranslationX(0.0f);
                    }
                    view2.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mChangeAnimations.remove(changeInfo.newHolder)) {
                        ChatListItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            }).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder, int i, List list) {
        RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation = super.recordPreLayoutInformation(state, viewHolder, i, list);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell)) {
            return recordPreLayoutInformation;
        }
        ItemHolderInfoExtended itemHolderInfoExtended = new ItemHolderInfoExtended();
        itemHolderInfoExtended.left = recordPreLayoutInformation.left;
        itemHolderInfoExtended.top = recordPreLayoutInformation.top;
        itemHolderInfoExtended.right = recordPreLayoutInformation.right;
        itemHolderInfoExtended.bottom = recordPreLayoutInformation.bottom;
        ChatMessageCell.TransitionParams transitionParams = ((ChatMessageCell) view).getTransitionParams();
        itemHolderInfoExtended.imageX = transitionParams.lastDrawingImageX;
        itemHolderInfoExtended.imageY = transitionParams.lastDrawingImageY;
        itemHolderInfoExtended.imageWidth = transitionParams.lastDrawingImageW;
        itemHolderInfoExtended.imageHeight = transitionParams.lastDrawingImageH;
        return itemHolderInfoExtended;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator
    protected void onAllAnimationsDone() {
        super.onAllAnimationsDone();
        this.recyclerListView.setClipChildren(true);
        while (!this.runOnAnimationsEnd.isEmpty()) {
            ((Runnable) this.runOnAnimationsEnd.remove(0)).run();
        }
        cancelAnimators();
    }

    private void cancelAnimators() {
        ThanosEffect thanosEffect;
        ArrayList arrayList = new ArrayList(this.animators.values());
        this.animators.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.thanosViews.isEmpty() || (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) == null) {
            return;
        }
        thanosEffect.kill();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(viewHolder.itemView);
        }
        super.endAnimation(viewHolder);
        restoreTransitionParams(viewHolder.itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreTransitionParams(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        if (view instanceof BotHelpCell) {
            int measuredHeight = (this.recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((BotHelpCell) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof UserInfoCell) {
            int measuredHeight2 = (this.recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((UserInfoCell) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            chatMessageCell.getTransitionParams().resetAnimation();
            chatMessageCell.setAnimationOffsetX(0.0f);
        } else if (view instanceof ChatActionCell) {
            ((ChatActionCell) view).getTransitionParams().resetAnimation();
        } else {
            view.setTranslationX(0.0f);
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.willChangedGroups;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        this.willChangedGroups.clear();
        cancelAnimators();
        ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.stickerToSendView.setAlpha(1.0f);
        }
        this.greetingsSticker = null;
        this.chatGreetingsView = null;
        for (int size2 = this.mPendingMoves.size() - 1; size2 >= 0; size2--) {
            DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) this.mPendingMoves.get(size2);
            restoreTransitionParams(moveInfo.holder.itemView);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size2);
        }
        for (int size3 = this.mPendingRemovals.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mPendingRemovals.get(size3);
            restoreTransitionParams(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
            this.mPendingRemovals.remove(size3);
        }
        for (int size4 = this.mPendingAdditions.size() - 1; size4 >= 0; size4--) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) this.mPendingAdditions.get(size4);
            restoreTransitionParams(viewHolder2.itemView);
            dispatchAddFinished(viewHolder2);
            this.mPendingAdditions.remove(size4);
        }
        for (int size5 = this.mPendingChanges.size() - 1; size5 >= 0; size5--) {
            endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) this.mPendingChanges.get(size5));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size6 = this.mMovesList.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList2 = (ArrayList) this.mMovesList.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    DefaultItemAnimator.MoveInfo moveInfo2 = (DefaultItemAnimator.MoveInfo) arrayList2.get(size7);
                    restoreTransitionParams(moveInfo2.holder.itemView);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.mAdditionsList.size() - 1; size8 >= 0; size8--) {
                ArrayList arrayList3 = (ArrayList) this.mAdditionsList.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) arrayList3.get(size9);
                    restoreTransitionParams(viewHolder3.itemView);
                    dispatchAddFinished(viewHolder3);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        this.mAdditionsList.remove(arrayList3);
                    }
                }
            }
            for (int size10 = this.mChangesList.size() - 1; size10 >= 0; size10--) {
                ArrayList arrayList4 = (ArrayList) this.mChangesList.get(size10);
                for (int size11 = arrayList4.size() - 1; size11 >= 0; size11--) {
                    endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) arrayList4.get(size11));
                    if (arrayList4.isEmpty()) {
                        this.mChangesList.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator
    protected boolean endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(viewHolder.itemView);
        }
        boolean z = false;
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
            z = true;
        }
        restoreTransitionParams(viewHolder.itemView);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    public void groupWillTransformToSingleMessage(MessageObject.GroupedMessages groupedMessages) {
        this.willRemovedGroup.put(Integer.valueOf(groupedMessages.messages.get(0).getId()), groupedMessages);
    }

    public void groupWillChanged(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            int childCount = this.recyclerListView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = this.recyclerListView.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    if (chatMessageCell.getTransitionParams().wasDraw && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableTop();
                        groupedMessages.transitionParams.bottom = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableBottom();
                        groupedMessages.transitionParams.left = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableLeft();
                        groupedMessages.transitionParams.right = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableRight();
                        groupedMessages.transitionParams.drawCaptionLayout = chatMessageCell.hasCaptionLayout();
                        groupedMessages.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                        groupedMessages.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.willChangedGroups.add(groupedMessages);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void animateAddImpl(final RecyclerView.ViewHolder viewHolder) {
        char c;
        boolean z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate add impl");
        }
        final View view = viewHolder.itemView;
        this.mAddAnimations.add(viewHolder);
        if (viewHolder == this.greetingsSticker) {
            view.setAlpha(1.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (chatMessageCell.getAnimationOffsetX() != 0.0f) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, (Property<ChatMessageCell, Float>) chatMessageCell.ANIMATION_OFFSET_X, chatMessageCell.getAnimationOffsetX(), 0.0f));
            }
            chatMessageCell.setPivotX(chatMessageCell.getBackgroundDrawableLeft() + ((chatMessageCell.getBackgroundDrawableRight() - chatMessageCell.getBackgroundDrawableLeft()) / 2.0f));
            view.animate().translationY(0.0f).setDuration(getAddDuration()).start();
        } else {
            view.animate().translationX(0.0f).translationY(0.0f).setDuration(getAddDuration()).start();
        }
        long max = (long) ((1.0f - Math.max(0.0f, Math.min(1.0f, view.getBottom() / this.recyclerListView.getMeasuredHeight()))) * 100.0f);
        if (!(view instanceof ChatMessageCell)) {
            c = 0;
        } else {
            if (viewHolder == this.greetingsSticker) {
                ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
                if (chatGreetingsView != null) {
                    chatGreetingsView.stickerToSendView.setAlpha(0.0f);
                }
                this.recyclerListView.setClipChildren(false);
                final ChatMessageCell chatMessageCell2 = (ChatMessageCell) view;
                View view2 = (View) this.chatGreetingsView.getParent();
                float x = this.chatGreetingsView.stickerToSendView.getX() + this.chatGreetingsView.getX() + view2.getX();
                float y = this.chatGreetingsView.stickerToSendView.getY() + this.chatGreetingsView.getY() + view2.getY();
                float imageX = chatMessageCell2.getPhotoImage().getImageX() + this.recyclerListView.getX() + chatMessageCell2.getX();
                float imageY = chatMessageCell2.getPhotoImage().getImageY() + this.recyclerListView.getY() + chatMessageCell2.getY();
                final float width = this.chatGreetingsView.stickerToSendView.getWidth();
                c = 0;
                final float height = this.chatGreetingsView.stickerToSendView.getHeight();
                final float imageWidth = chatMessageCell2.getPhotoImage().getImageWidth();
                final float imageHeight = chatMessageCell2.getPhotoImage().getImageHeight();
                final float f = x - imageX;
                final float f2 = y - imageY;
                final float imageX2 = chatMessageCell2.getPhotoImage().getImageX();
                final float imageY2 = chatMessageCell2.getPhotoImage().getImageY();
                chatMessageCell2.getTransitionParams().imageChangeBoundsTransition = true;
                chatMessageCell2.getTransitionParams().animateDrawingTimeAlpha = true;
                chatMessageCell2.getPhotoImage().setImageCoords(imageX2 + f, imageX2 + f2, width, height);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatListItemAnimator.$r8$lambda$jgyXUoF7EMpTRfhVSeeH1Kt7DMA(ChatMessageCell.this, imageX2, f, imageY2, f2, width, imageWidth, height, imageHeight, valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.10
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        chatMessageCell2.getTransitionParams().resetAnimation();
                        chatMessageCell2.getPhotoImage().setImageCoords(imageX2, imageY2, imageWidth, imageHeight);
                        if (ChatListItemAnimator.this.chatGreetingsView != null) {
                            ChatListItemAnimator.this.chatGreetingsView.stickerToSendView.setAlpha(1.0f);
                        }
                        chatMessageCell2.invalidate();
                    }
                });
                animatorSet.play(ofFloat);
                max = max;
                z = false;
                view.setAlpha(0.0f);
                Property property = View.ALPHA;
                float[] fArr = new float[2];
                fArr[c] = view.getAlpha();
                fArr[1] = 1.0f;
                Animator[] animatorArr = new Animator[1];
                animatorArr[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                animatorSet.playTogether(animatorArr);
                if (!z) {
                    view.setScaleX(0.9f);
                    view.setScaleY(0.9f);
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[2];
                    fArr2[c] = view.getScaleY();
                    fArr2[1] = 1.0f;
                    Animator[] animatorArr2 = new Animator[1];
                    animatorArr2[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
                    animatorSet.playTogether(animatorArr2);
                    Property property3 = View.SCALE_X;
                    float[] fArr3 = new float[2];
                    fArr3[c] = view.getScaleX();
                    fArr3[1] = 1.0f;
                    Animator[] animatorArr3 = new Animator[1];
                    animatorArr3[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, fArr3);
                    animatorSet.playTogether(animatorArr3);
                } else {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                if (viewHolder != this.greetingsSticker) {
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.setStartDelay(max);
                    animatorSet.setDuration(250L);
                }
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.11
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        view.setAlpha(1.0f);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        animator.removeAllListeners();
                        view.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationY(0.0f);
                        view.setTranslationY(0.0f);
                        if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                            ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                            ChatListItemAnimator.this.dispatchFinishedWhenDone();
                        }
                    }
                });
                this.animators.put(viewHolder, animatorSet);
                animatorSet.start();
            }
            c = 0;
            MessageObject.GroupedMessages currentMessagesGroup = ((ChatMessageCell) view).getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                Long l = (Long) this.groupIdToEnterDelay.get(Long.valueOf(currentMessagesGroup.groupId));
                if (l == null) {
                    this.groupIdToEnterDelay.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(max));
                } else {
                    max = l.longValue();
                    if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        animatorSet.setStartDelay(140L);
                    }
                }
            }
            max = max;
            if (currentMessagesGroup != null) {
                animatorSet.setStartDelay(140L);
            }
        }
        z = true;
        view.setAlpha(0.0f);
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[2];
        fArr4[c] = view.getAlpha();
        fArr4[1] = 1.0f;
        Animator[] animatorArr4 = new Animator[1];
        animatorArr4[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, fArr4);
        animatorSet.playTogether(animatorArr4);
        if (!z) {
        }
        if (viewHolder != this.greetingsSticker) {
        }
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        });
        this.animators.put(viewHolder, animatorSet);
        animatorSet.start();
    }

    public static /* synthetic */ void $r8$lambda$jgyXUoF7EMpTRfhVSeeH1Kt7DMA(ChatMessageCell chatMessageCell, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.getTransitionParams().animateChangeProgress = floatValue;
        if (chatMessageCell.getTransitionParams().animateChangeProgress > 1.0f) {
            chatMessageCell.getTransitionParams().animateChangeProgress = 1.0f;
        }
        float f9 = 1.0f - floatValue;
        chatMessageCell.getPhotoImage().setImageCoords(f + (f2 * f9), f3 + (f4 * f9), (f5 * f9) + (f6 * floatValue), (f7 * f9) + (f8 * floatValue));
        chatMessageCell.invalidate();
    }

    protected void animateRemoveImpl(final RecyclerView.ViewHolder viewHolder, boolean z) {
        Utilities.Callback0Return callback0Return;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("animate remove impl ");
            sb.append(z ? " with thanos" : "");
            FileLog.d(sb.toString());
        }
        final View view = viewHolder.itemView;
        this.mRemoveAnimations.add(viewHolder);
        if (z && (callback0Return = this.getThanosEffectContainer) != null) {
            ThanosEffect thanosEffect = (ThanosEffect) callback0Return.run();
            dispatchRemoveStarting(viewHolder);
            thanosEffect.animate(view, new Runnable() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ChatListItemAnimator.$r8$lambda$0Fw2DeKdCu1fL7NSC9-LfaHUiJ8(ChatListItemAnimator.this, view, viewHolder);
                }
            });
            this.thanosViews.add(view);
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
            dispatchRemoveStarting(viewHolder);
            ofFloat.setDuration(getRemoveDuration());
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator.12
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    animator.removeAllListeners();
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mRemoveAnimations.remove(viewHolder)) {
                        ChatListItemAnimator.this.dispatchRemoveFinished(viewHolder);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            });
            this.animators.put(viewHolder, ofFloat);
            ofFloat.start();
        }
        this.recyclerListView.stopScroll();
    }

    public static /* synthetic */ void $r8$lambda$0Fw2DeKdCu1fL7NSC9-LfaHUiJ8(ChatListItemAnimator chatListItemAnimator, View view, RecyclerView.ViewHolder viewHolder) {
        chatListItemAnimator.getClass();
        view.setVisibility(0);
        if (chatListItemAnimator.mRemoveAnimations.remove(viewHolder)) {
            chatListItemAnimator.dispatchRemoveFinished(viewHolder);
            chatListItemAnimator.dispatchFinishedWhenDone();
        }
        chatListItemAnimator.thanosViews.remove(view);
    }

    private void animateRemoveGroupImpl(final ArrayList arrayList) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove group impl with thanos");
        }
        this.mRemoveAnimations.addAll(arrayList);
        ThanosEffect thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run();
        for (int i = 0; i < arrayList.size(); i++) {
            dispatchRemoveStarting((RecyclerView.ViewHolder) arrayList.get(i));
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((RecyclerView.ViewHolder) arrayList.get(i2)).itemView);
        }
        thanosEffect.animateGroup(arrayList2, new Runnable() { // from class: org.telegram.ui.recyclerview.ChatListItemAnimator$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                ChatListItemAnimator.$r8$lambda$Gr_Ym_CfugNb-nWQr84--8cwBmg(ChatListItemAnimator.this, arrayList2, arrayList);
            }
        });
        this.thanosViews.add((View) arrayList2.get(0));
        this.recyclerListView.stopScroll();
    }

    public static /* synthetic */ void $r8$lambda$Gr_Ym_CfugNb-nWQr84--8cwBmg(ChatListItemAnimator chatListItemAnimator, ArrayList arrayList, ArrayList arrayList2) {
        chatListItemAnimator.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
        if (chatListItemAnimator.mRemoveAnimations.removeAll(arrayList2)) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                chatListItemAnimator.dispatchRemoveFinished((RecyclerView.ViewHolder) arrayList2.get(i2));
            }
            chatListItemAnimator.dispatchFinishedWhenDone();
        }
        chatListItemAnimator.thanosViews.removeAll(arrayList);
    }

    public void setShouldAnimateEnterFromBottom(boolean z) {
        this.shouldAnimateEnterFromBottom = z;
    }

    public void onDestroy() {
        onAllAnimationsDone();
    }

    public boolean willRemoved(View view) {
        RecyclerView.ViewHolder childViewHolder = this.recyclerListView.getChildViewHolder(view);
        if (childViewHolder != null) {
            return this.mPendingRemovals.contains(childViewHolder) || this.mRemoveAnimations.contains(childViewHolder);
        }
        return false;
    }

    public boolean willAddedFromAlpha(View view) {
        RecyclerView.ViewHolder childViewHolder;
        if (this.shouldAnimateEnterFromBottom || (childViewHolder = this.recyclerListView.getChildViewHolder(view)) == null) {
            return false;
        }
        return this.mPendingAdditions.contains(childViewHolder) || this.mAddAnimations.contains(childViewHolder);
    }

    public void onGreetingStickerTransition(RecyclerView.ViewHolder viewHolder, ChatGreetingsView chatGreetingsView) {
        this.greetingsSticker = viewHolder;
        this.chatGreetingsView = chatGreetingsView;
        this.shouldAnimateEnterFromBottom = false;
    }

    public void setReversePositions(boolean z) {
        this.reversePositions = z;
    }

    class MoveInfoExtended extends DefaultItemAnimator.MoveInfo {
        public boolean animateBackgroundOnly;
        public boolean animateChangeGroupBackground;
        public boolean animateChangeInternal;
        boolean animateImage;
        public boolean animatePinnedBottom;
        boolean animateRemoveGroup;
        int deltaBottom;
        int deltaLeft;
        int deltaRight;
        int deltaTop;
        public int groupOffsetBottom;
        public int groupOffsetLeft;
        public int groupOffsetRight;
        public int groupOffsetTop;
        float imageHeight;
        float imageWidth;
        float imageX;
        float imageY;

        MoveInfoExtended(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            super(viewHolder, i, i2, i3, i4);
        }
    }

    class ItemHolderInfoExtended extends RecyclerView.ItemAnimator.ItemHolderInfo {
        float imageHeight;
        float imageWidth;
        float imageX;
        float imageY;

        ItemHolderInfoExtended() {
        }
    }

    public void prepareThanos(RecyclerView.ViewHolder viewHolder) {
        MessageObject messageObject;
        if (viewHolder == null) {
            return;
        }
        this.toBeSnapped.add(viewHolder);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell) || (messageObject = ((ChatMessageCell) view).getMessageObject()) == null) {
            return;
        }
        messageObject.deletedByThanos = true;
    }

    public void setOnSnapMessage(Utilities.Callback0Return callback0Return, Utilities.Callback0Return callback0Return2) {
        this.supportsThanosEffectContainer = callback0Return;
        this.getThanosEffectContainer = callback0Return2;
    }
}
